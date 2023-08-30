package Animal.Herbivore;
import Animal.Animal;
import Animal.Species;
import Animal.Cell;

public abstract class Herbivore extends Animal {
    int chance;

    public Herbivore(Species species) {
        super(species);
    }
    public Herbivore(Cell cell, Species species){
        super(cell, species);
    }
}