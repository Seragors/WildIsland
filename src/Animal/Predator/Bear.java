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
        int chance;
        switch (species) {
            case COW -> chance = 20;
            case SNAKE -> chance = 80;
            case HORSE -> chance = 40;
            case DEER -> chance = 80;
            case HARE -> chance = 80;
            case HAMSTER -> chance = 90;
            case GOAT -> chance = 70;
            case SHEEP -> chance = 70;
            case KANGAROO -> chance = 50;
            case DUCK -> chance = 10;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Bear(getCell());
    }
}