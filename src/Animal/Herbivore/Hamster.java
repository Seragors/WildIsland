package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Hamster extends Herbivore {

    public Hamster() {
        super(Species.HAMSTER);
    }

    public Hamster(Cell cell) {
        super(cell, Species.HAMSTER);
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
        return new Hamster(getCell());
    }
}