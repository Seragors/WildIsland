package Animal.Herbivore;

import Animal.Cell;
import Animal.Species;

public class Kangaroo extends Herbivore{

    public Kangaroo() {
        super(Species.KANGAROO);
    }

    public Kangaroo(Cell cell) {
        super(cell, Species.KANGAROO);
    }
}
