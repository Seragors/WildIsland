package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Sheep extends Herbivore {

    public Sheep() {
        super(Species.SHEEP);
    }

    public Sheep(Cell cell) {
        super(cell, Species.SHEEP);
    }

    @Override
    public Animal born() {
        return new Sheep(getCell());
    }
}