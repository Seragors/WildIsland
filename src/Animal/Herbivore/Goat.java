package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Goat extends Herbivore {

    public Goat() {
        super(Species.GOAT);
    }

    public Goat(Cell cell) {
        super(cell, Species.GOAT);
    }

    @Override
    public Animal born() {
        return new Goat(getCell());
    }
}