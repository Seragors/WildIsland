package Animal.Herbivore;
import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Cow extends Herbivore {
    public Cow() {
        super(Species.COW);
    }
    public Cow(Cell cell){
        super(cell,Species.COW);
    }

    @Override
    public Animal born() {
        return new Cow(getCell());
    }
}