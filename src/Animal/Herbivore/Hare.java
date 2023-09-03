package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Hare extends Herbivore {

    public Hare() {
        super(Species.HARE);
    }

    public Hare(Cell cell) {
        super(cell, Species.HARE);
    }

    @Override
    public int chanceEat(Species species) {
        int chance;
        switch (species) {
            case HERB -> chance = 100;
            default -> chance = 0;
        }
        return chance;
    }

    @Override
    public Animal born() {
        return new Hare(getCell());
    }
}
