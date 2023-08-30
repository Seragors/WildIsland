package Animal.Herbivore;
import Animal.Cell;
import Animal.Species;

public class Hamster extends Herbivore{

    public Hamster() {
        super(Species.HAMSTER);
    }

    public Hamster(Cell cell) {
        super(cell, Species.HAMSTER);
    }
}