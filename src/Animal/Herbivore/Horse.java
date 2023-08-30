package Animal.Herbivore;
import Animal.Cell;
import Animal.Species;

public class Horse extends Herbivore{

    public Horse() {
        super(Species.HORSE);
    }

    public Horse(Cell cell) {
        super(cell, Species.HORSE);
    }
}

