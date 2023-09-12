package Animal.Herbivore;

import Animal.Organism;
import Animal.Species;
import Map.Island;

public class Herb extends Organism {

    public Herb() {
        super(Species.HERB);
        Island.cellList.get(indexCell).getHerbList().add(Herb.this);
        Island.herbList.add(Herb.this);
    }

    @Override
    public void die() {
        if (getWeight() <= 0) {
            Island.herbList.remove(Herb.this);
            getCell().getHerbList().remove(Herb.this);
            System.out.println(getName() + " загинула");
        }
    }
}
