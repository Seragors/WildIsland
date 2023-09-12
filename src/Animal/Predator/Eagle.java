package Animal.Predator;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Eagle extends Predator {
    public Eagle() {
        super(Species.EAGLE);
    }

    public Eagle(Cell cell) {
        super(cell, Species.EAGLE);
    }

    @Override
    public int chanceEat(Species species) {
        int chance =
                switch (species) {
                    case SNAKE -> 10;
                    case HARE -> 90;
                    case HAMSTER -> 90;
                    case DUCK -> 80;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Eagle(getCell());
    }
}