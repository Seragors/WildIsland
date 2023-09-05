package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Boar extends Herbivore {

    public Boar() {
        super(Species.BOAR);
    }

    public Boar(Cell cell) {
        super(cell, Species.BOAR);
    }

    @Override
    public int chanceEat(Species species) {
        int chance =
                switch (species) {
                    case HERB -> 100;
                    case CATERPILLAR -> 90;
                    case HAMSTER -> 50;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Boar(getCell());
    }
}
