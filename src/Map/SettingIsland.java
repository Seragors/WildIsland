package Map;

import Animal.Herbivore.Herbivore;
import Animal.Predator.Predator;

public class SettingIsland {
    public static final int X = 100;
    public static final int Y = 20;
    public static final int COUNT_OF_HERB = 200;
    public static final int COUNT_OF_WOLF = 30;
    public static final int COUNT_OF_SNAKE = 30;
    public static final int COUNT_OF_FOX = 30;
    public static final int COUNT_OF_BEAR = 5;
    public static final int COUNT_OF_EAGLE = 20;
    public static final int COUNT_OF_HORSE = 20;
    public static final int COUNT_OF_DEER = 20;
    public static final int COUNT_OF_HARE = 150;
    public static final int COUNT_OF_HAMSTER = 500;
    public static final int COUNT_OF_GOAT = 140;
    public static final int COUNT_OF_SHEEP = 140;
    public static final int COUNT_OF_KANGAROO = 50;
    public static final int COUNT_OF_COW = 10;
    public static final int COUNT_OF_DUCK = 200;
    public static final int COUNT_OF_CATERPILLAR = 1000;

    public SettingIsland() {
        new Island(X, Y);
        for (int i = 0; i < COUNT_OF_HERB; i++) {
            new Herb();
        }
        for (int i = 0; i < COUNT_OF_WOLF; i++) {

        }
        for (int i = 0; i < COUNT_OF_SNAKE; i++) {

        }
        for (int i = 0; i < COUNT_OF_FOX; i++) {

        }
        for (int i = 0; i < COUNT_OF_BEAR; i++) {

        }
        for (int i = 0; i < COUNT_OF_EAGLE; i++) {

        }
        for (int i = 0; i < COUNT_OF_HORSE; i++) {

        }
        for (int i = 0; i < COUNT_OF_DEER; i++) {

        }
        for (int i = 0; i < COUNT_OF_HARE; i++) {

        }
        for (int i = 0; i < COUNT_OF_HAMSTER; i++) {

        }
        for (int i = 0; i < COUNT_OF_GOAT; i++) {

        }
        for (int i = 0; i < COUNT_OF_SHEEP; i++) {

        }
        for (int i = 0; i < COUNT_OF_KANGAROO; i++) {

        }
        for (int i = 0; i < COUNT_OF_COW; i++) {

        }
        for (int i = 0; i < COUNT_OF_DUCK; i++) {

        }
        for (int i = 0; i < COUNT_OF_CATERPILLAR; i++) {

        }
        System.out.println("Створенний острів розміром" + X + "x" + Y + " c " + Island.herbList.size() + "Рослинами, " + countHerbivore() + "Травоїдні, " + countPredator() + "Хижаками");
    }

    public int countHerbivore() {
        int count = 0;
        for (int i = 0; i < Island.animalList.size(); i++) {
            if (Island.animalList.get(i) instanceof Herbivore)
                count++;
        }
        return count;
    }

    public int countPredator() {
        int count = 0;
        for (int i = 0; i < Island.animalList.size(); i++) {
            if (Island.animalList.get(i) instanceof Predator)
                count++;
        }
        return count;
    }

    public void getStatistic() {
        System.out.println("На острові: " + Island.herbList.size() + " Рослин: " + countHerbivore() + " Травоїдних: " + countPredator() + "Хижаків");
    }
}
