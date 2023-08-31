package Animal.Herbivore;
import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Caterpillar extends Herbivore{

    public Caterpillar() {
        super(Species.CATERPILLAR);
    }
    public Caterpillar(Cell cell){
        super(cell, Species.CATERPILLAR);
    }

    @Override
    public Animal born() {
        return new Caterpillar(getCell());
    }
}