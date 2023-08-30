package Animal.Herbivore;
import Animal.Cell;
import Animal.Species;

public class Goat extends Herbivore{

    public Goat() {
        super(Species.GOAT);
    }

    public Goat(Cell cell) {
        super(cell, Species.GOAT);
    }
}