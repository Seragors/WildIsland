package Animal.Predator;

import Animal.Animal;
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
        int chance =
                switch (species) {
                    case HARE -> 70;
                    case HAMSTER -> 90;
                    case DUCK -> 60;
                    case CATERPILLAR -> 40;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Fox(getCell());
    }
}