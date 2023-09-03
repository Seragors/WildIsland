package Map;

import Animal.Animal;
import Animal.Cell;
import Animal.Herbivore.Herb;

import java.util.ArrayList;
import java.util.List;

public class Island {
    public static int x;
    public static int y;
    public static List<Cell> cellList = new ArrayList<>();
    public static List<Animal> animalList = new ArrayList<>();
    public static List<Herb> herbList = new ArrayList<Herb>();

    public Island(int x, int y) {
        this.x = x;
        this.y = y;
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                Cell cell = new Cell(j, i);
                cellList.add(cell);
            }
        }
    }

    @Override
    public String toString() {
        return "Island{" +
                "xLenght=" + x +
                ", yLenght=" + y +
                ", cellList=" + cellList +
                '}';
    }
}