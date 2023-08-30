package Animal.Herbivore;
import Animal.Cell;
import Animal.Species;

public class Duck extends Herbivore{

    public Duck() {
        super(Species.DUCK);
    }

    public Duck(Cell cell) {
        super(cell, Species.DUCK);
    }
}