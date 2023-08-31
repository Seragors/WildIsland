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
        int chance;
        switch (species) {
            case HORSE -> chance = 10;
            case DEER -> chance = 15;
            case HARE -> chance = 60;
            case HAMSTER -> chance = 80;
            case GOAT -> chance = 60;
            case SHEEP -> chance = 70;
            case KANGAROO -> chance = 15;
            case COW -> chance = 10;
            case DUCK -> chance = 40;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Wolf(getCell());
    }
}