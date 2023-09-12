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
        int chance =
                switch (species) {
                    case HERB -> 100;
                    case CATERPILLAR -> 90;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Cow(getCell());
    }
}