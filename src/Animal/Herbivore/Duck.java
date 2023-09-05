package Animal.Herbivore;

import Animal.Animal;
import Animal.Cell;
import Animal.Species;

public class Duck extends Herbivore {

    public Duck() {
        super(Species.DUCK);
    }

    public Duck(Cell cell) {
        super(cell, Species.DUCK);
    }

    public int chanceEat(Species species) {
        int chance =
                switch (species) {
                    case CATERPILLAR -> 90;
                    case HERB -> 100;
                    default -> 0;
                };
        return chance;
    }

    @Override
    public Animal born() {
        return new Duck(getCell());
    }
}