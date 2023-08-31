package Animal.Herbivore;
import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Duck extends Herbivore{

    public Duck() {
        super(Species.DUCK);
    }

    public Duck(Cell cell) {
        super(cell, Species.DUCK);
    }

    @Override
    public Animal born() {
        return new Duck(getCell());
    }
}