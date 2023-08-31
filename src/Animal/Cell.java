package Animal;

import Map.Herb;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private int x;
    private int y;
    private List<Animal> animalList = new ArrayList<>();
    private List<Herb> herbList = new ArrayList<>();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Cell(int x, int y, List<Animal> animalList, List<Herb> herbList) {
        this.x = x;
        this.y = y;
        this.animalList = animalList;
        this.herbList = herbList;
    }

    public int countSpecies(Species species) {
        int count = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).equals(species)) {
                count++;
            }
        }
        return count;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Herb> getHerbList() {
        return herbList;
    }

    public void setHerbList(List<Herb> herbList) {
        this.herbList = herbList;
    }

    @Override
    public String toString() {
        return "Комірка {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
