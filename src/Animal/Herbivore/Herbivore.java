package Animal.Herbivore;

import Animal.Animal;
import Animal.Species;
import Animal.Cell;
import Map.Island;

import java.util.Random;

public abstract class Herbivore extends Animal {

    private static final int MAX_COUNT = 100;
    int chance;

    public Herbivore(Species species) {
        super(species);
    }

    public Herbivore(Cell cell, Species species) {
        super(cell, species);
    }

    public int chanceEat(Species species) {
        return chance;
    }

    @Override
    public synchronized void eat() {
        if (getSatiety() < getWeightSatiety()) {
            for (int i = 0; i < getCell().getHerbList().size(); i++) {
                if (getSatiety() < getWeightSatiety()) {
                    int j = new Random().nextInt(MAX_COUNT) + 1;
                    Herb food = getCell().getHerbList().get(i);
                    Animal animalFood = getCell().getAnimalList().get(i);
                    chance = chanceEat(animalFood.getSpecies());
                    double oldSatiety = getSatiety();
                    double newSatiety = oldSatiety + food.getWeight();
                    if (newSatiety > getWeightSatiety()) {
                        newSatiety = getWeightSatiety();
                    }
                    die();
                    setSatiety(newSatiety);
                    if (newSatiety != oldSatiety) {
                        if (j <= chance) {
                            double newStatietyAnimal = getSatiety() + animalFood.getWeightSatiety();
                            if (newStatietyAnimal > getWeightSatiety()) {
                                newStatietyAnimal = getWeightSatiety();
                            }
                            setSatiety(newStatietyAnimal);
                            Island.animalList.remove(animalFood);
                            getCell().getAnimalList().remove(animalFood);
                            System.out.println(getName() + " з'їв " + animalFood.getName());
                        } else {
                            food.setWeight(food.getWeight() - (newSatiety - oldSatiety));
                            System.out.println(getName() + " з'їв " + food.getName());
                            food.die();
                        }
                    }
                }
            }
        }
    }
}