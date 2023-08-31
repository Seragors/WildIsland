package Animal.Herbivore;
import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Horse extends Herbivore{

    public Horse() {
        super(Species.HORSE);
    }

    public Horse(Cell cell) {
        super(cell, Species.HORSE);
    }

    @Override
    public Animal born() {
        return new Horse(getCell());
    }
}

