package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Cow extends Herbivore {
    public Cow() {
        super(Species.COW);
    }

    public Cow(Cell cell) {
        super(cell, Species.COW);
    }

    @Override
    public int chanceEat(Species species) {
        int chance;
        switch (species) {
            case HERB -> chance = 100;
            case CATERPILLAR -> chance = 90;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Cow(getCell());
    }
}