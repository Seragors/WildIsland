package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Deer extends Herbivore {

    public Deer() {
        super(Species.DEER);
    }

    public Deer(Cell cell) {
        super(cell, Species.DEER);
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
        return new Deer(getCell());
    }
}