package Animal.Predator;
import Animal.Animal;
import Animal.Species;
import Animal.Cell;

public abstract class Predator extends Animal {

    int chance;

    public Predator(Species species) {
        super(species);
    }

    public Predator(Cell cell, Species species){
        super(cell,species);
    }

    public int chanceEat(Species species) {
        return chance;
    }

  //  @Override
//    public void eat() {

 //   }
}