package Animal.Herbivore;
import Animal.Cell;
import Animal.Species;

public class Sheep extends Herbivore{

    public Sheep() {
        super(Species.SHEEP);
    }

    public Sheep(Cell cell) {
        super(cell, Species.SHEEP);
    }
}