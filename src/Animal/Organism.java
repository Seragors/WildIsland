package Animal;

import Map.Island;

import java.util.Random;

public abstract class Organism {

    private String name;
    private Cell cell;

    private Species species;
    private double weight;

    public int x, y;
    public int indexCell;

    public Organism(Species species) {
        this.species = species;
        x = (new Random().nextInt(Island.x)) + 1;
        y = (new Random().nextInt(Island.y)) + 1;
        indexCell = ((Island.x) * (y - 1) + x) - 1;
        this.cell = Island.cellList.get(indexCell);
        this.weight = species.getWeight();
        this.name = species.getName() + species.getPicture();
    }

    public Organism(Cell cell, Species species) {
        this.cell = cell;
        this.weight = species.getWeight();
        this.name = species.getName() + species.getPicture();
        this.species = species;
        x = cell.getX();
        y = cell.getY();
        indexCell = ((Island.x) * (y - 1) + x) - 1;
    }
    public abstract void die();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "name='" + name + '\'' +
                ", cell=" + cell +
                ", species=" + species +
                ", weight=" + weight +
                '}';
    }
}
