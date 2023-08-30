package Animal.Herbivore;
import Animal.Cell;
import Animal.Species;

public class Deer extends Herbivore{

    public Deer() {
        super(Species.DEER);
    }

    public Deer(Cell cell) {
        super(cell, Species.DEER);
    }
}