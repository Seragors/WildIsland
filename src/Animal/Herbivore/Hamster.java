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
        int chance =
                switch (species) {
                    case HERB -> 100;
                    case CATERPILLAR -> 90;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Hamster(getCell());
    }
}