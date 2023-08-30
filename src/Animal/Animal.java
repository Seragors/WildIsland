package Animal;
public abstract class Animal extends Organism {
  //  public abstract Animal born ();
  //  public abstract void eat();

    public Animal(Species species) {
        super(species);
    }
    public Animal(Cell cell, Species species){
        super(cell,species);
    }
}