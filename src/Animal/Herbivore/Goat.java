package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Goat extends Herbivore {

    public Goat() {
        super(Species.GOAT);
    }

    public Goat(Cell cell) {
        super(cell, Species.GOAT);
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
        return new Goat(getCell());
    }
}