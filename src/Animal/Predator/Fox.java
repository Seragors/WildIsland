package Animal.Predator;

import Animal.Cell;
import Animal.Species;

public class Fox extends Predator {
    public Fox() {
        super(Species.FOX);
    }

    public Fox(Cell cell) {
        super(cell, Species.FOX);
    }

    @Override
    public int chanceEat(Species species) {
        int chance;
        switch (species) {
            case HARE -> chance = 70;
            case HAMSTER -> chance = 90;
            case DUCK -> chance = 60;
            case CATERPILLAR -> chance = 40;
            default -> chance = 0;
        }
        return chance;
    }


}