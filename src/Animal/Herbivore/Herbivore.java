package Animal.Herbivore;

import Animal.Animal;
import Animal.Species;
import Animal.Cell;
import Map.Herb;

public abstract class Herbivore extends Animal {
    int chance;

    public Herbivore(Species species) {
        super(species);
    }

    public Herbivore(Cell cell, Species species) {
        super(cell, species);
    }

    @Override
    public void eat() {
        if (getSatiety() < getWeightSatiety()) {
            for (int i = 0; i < getCell().getHerbList().size(); i++) {
                if (getSatiety() < getWeightSatiety()) {
                    Herb food = getCell().getHerbList().get(i);
                    double oldSatiety = getSatiety();
                    double newSatiety = oldSatiety + food.getWeight();
                    if (newSatiety > getWeightSatiety()) {
                        newSatiety = getWeightSatiety();
                        setSatiety(newSatiety);
                        if (newSatiety != oldSatiety) {
                            food.setWeight(food.getWeight() - (newSatiety - oldSatiety));
                            System.out.println(getName() + " Закусив " + food.getName());
                            food.die();
                        }
                    }
                }
            }
        }
    }
}