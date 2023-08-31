package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Kangaroo extends Herbivore{

    public Kangaroo() {
        super(Species.KANGAROO);
    }

    public Kangaroo(Cell cell) {
        super(cell, Species.KANGAROO);
    }

    @Override
    public Animal born() {
        return new Kangaroo(getCell());
    }
}
