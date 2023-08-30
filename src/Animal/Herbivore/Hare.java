package Animal.Herbivore;
import Animal.Cell;
import Animal.Species;

public class Hare extends Herbivore{

    public Hare() {
        super(Species.HARE);
    }

    public Hare(Cell cell) {
        super(cell, Species.HARE);
    }
}
