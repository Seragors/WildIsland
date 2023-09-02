package Animal.Predator;

import Animal.Animal;
import Animal.Species;
import Animal.Cell;
import Map.Island;

import java.util.Random;

public abstract class Predator extends Animal {

    private static final int MAX_COUNT = 100;
    int chance;

    public Predator(Species species) {
        super(species);
    }

    public Predator(Cell cell, Species species) {
        super(cell, species);
    }

    public int chanceEat(Species species) {
        return chance;
    }

    public synchronized void eat() {
        if (getSatiety() < getWeightSatiety()) {
            for (int i = 0; i < getCell().getAnimalList().size(); i++) {
                if (getSatiety() < getWeightSatiety()) {
                    int j = new Random().nextInt(MAX_COUNT) + 1;
                    Animal food = getCell().getAnimalList().get(i);
                    chance = chanceEat(food.getSpecies());
                    if (j <= chance) {
                        double newStatiety = getSatiety() + food.getWeightSatiety();
                        if (newStatiety > getWeightSatiety()) {
                            newStatiety = getWeightSatiety();
                        }
                        setSatiety(newStatiety);
                        Island.animalList.remove(food);
                        getCell().getAnimalList().remove(food);
                        System.out.println(getName() + " з'їв " + food.getName());
                    }
                }
            }
        }
    }

}