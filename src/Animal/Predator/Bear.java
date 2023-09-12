package Animal.Predator;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Bear extends Predator {
    public Bear() {
        super(Species.BEAR);
    }

    public Bear(Cell cell) {
        super(cell, Species.BEAR);
    }

    @Override
    public int chanceEat(Species species) {
        int chance =
                switch (species) {
                    case COW -> 20;
                    case SNAKE -> 80;
                    case HORSE -> 40;
                    case DEER -> 80;
                    case HARE -> 80;
                    case HAMSTER -> 90;
                    case GOAT -> 70;
                    case SHEEP -> 70;
                    case BOAR -> 50;
                    case DUCK -> 10;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Bear(getCell());
    }
}