package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Horse extends Herbivore {

    public Horse() {
        super(Species.HORSE);
    }

    public Horse(Cell cell) {
        super(cell, Species.HORSE);
    }

    @Override
    public int chanceEat(Species species) {
        int chance;
        switch (species) {
            case HERB -> chance = 100;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Horse(getCell());
    }
}

