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
        int chance;
        switch (species) {
            case FOX -> chance = 15;
            case HARE -> chance = 20;
            case HAMSTER -> chance = 40;
            case DUCK -> chance = 10;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Snake(getCell());
    }
}