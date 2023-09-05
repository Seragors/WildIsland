package Animal.Predator;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Wolf extends Predator {

    public Wolf() {
        super(Species.WOLF);
    }

    public Wolf(Cell cell) {
        super(cell, Species.WOLF);
    }

    @Override
    public int chanceEat(Species species) {
        int chance =
                switch (species) {
                    case HORSE -> 10;
                    case DEER -> 15;
                    case HARE -> 60;
                    case HAMSTER -> 80;
                    case GOAT -> 60;
                    case SHEEP -> 70;
                    case BOAR -> 15;
                    case COW -> 10;
                    case DUCK -> 40;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Wolf(getCell());
    }
}