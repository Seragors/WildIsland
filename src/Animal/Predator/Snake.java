package Animal.Predator;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Snake extends Predator {

    public Snake() {
        super(Species.SNAKE);
    }

    public Snake(Cell cell) {
        super(cell, Species.SNAKE);
    }

    @Override
    public int chanceEat(Species species) {
        int chance =
                switch (species) {
                    case FOX -> 15;
                    case HARE -> 20;
                    case HAMSTER -> 40;
                    case DUCK -> 10;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Snake(getCell());
    }
}