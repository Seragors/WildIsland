package Animal.Herbivore;
import Animal.Cell;
import Animal.Species;

public class Cow extends Herbivore {
    public Cow() {
        super(Species.COW);
    }
    public Cow(Cell cell){
        super(cell,Species.COW);
    }
}