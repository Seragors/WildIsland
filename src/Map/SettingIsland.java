package Map;

import Animal.Herbivore.*;
import Animal.Predator.*;

public class SettingIsland {
    public static final int X = 100;
    public static final int Y = 20;
    public static final int COUNT_OF_MOVE = 2;
    public static final int COUNT_OF_SLEEP = 4;
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
            new Wolf();
        }
        for (int i = 0; i < COUNT_OF_SNAKE; i++) {
            new Snake();
        }
        for (int i = 0; i < COUNT_OF_FOX; i++) {
            new Fox();
        }
        for (int i = 0; i < COUNT_OF_BEAR; i++) {
            new Bear();
        }
        for (int i = 0; i < COUNT_OF_EAGLE; i++) {
            new Eagle();
        }
        for (int i = 0; i < COUNT_OF_HORSE; i++) {
            new Horse();
        }
        for (int i = 0; i < COUNT_OF_DEER; i++) {
            new Deer();
        }
        for (int i = 0; i < COUNT_OF_HARE; i++) {
            new Hare();
        }
        for (int i = 0; i < COUNT_OF_HAMSTER; i++) {
            new Hamster();
        }
        for (int i = 0; i < COUNT_OF_GOAT; i++) {
            new Goat();
        }
        for (int i = 0; i < COUNT_OF_SHEEP; i++) {
            new Sheep();
        }
        for (int i = 0; i < COUNT_OF_KANGAROO; i++) {
            new Kangaroo();
        }
        for (int i = 0; i < COUNT_OF_COW; i++) {
            new Cow();
        }
        for (int i = 0; i < COUNT_OF_DUCK; i++) {
            new Duck();
        }
        for (int i = 0; i < COUNT_OF_CATERPILLAR; i++) {
            new Caterpillar();
        }
        System.out.println("Створенний острів розміром: " + Island.x + "x" + Island.y + " з " + Island.herbList.size() + " Рослинами, " + countHerbivore() + " Травоїдними, " + countPredator() + " Хижаками.");
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

    public synchronized void animalsMove() {
        for (int i = 0; i < Island.animalList.size(); i++) {
            Island.animalList.get(i).move();
        }
    }

    public synchronized void eatAnimals() {
        for (int i = 0; i < Island.animalList.size(); i++) {
            if (Island.animalList.get(i) instanceof Predator){
                Island.animalList.get(i).eat();
            }
        }
    }
    public synchronized void animalReproduction (){
        for (int i = 0; i < Island.animalList.size(); i++){
            Island.animalList.get(i).reproduction();
        }
    }

    public synchronized void  eatHerb(){
        for (int i = 0; i < Island.animalList.size(); i++){
            if (Island.animalList.get(i) instanceof Herbivore){
                Island.animalList.get(i).eat();
            }
        }
    }

    public void getStatistic() {
        System.out.println("На острові: " + Island.herbList.size() + " Рослин, " + countHerbivore() + " Травоїдних, " + countPredator() + " Хижаків.");
    }
}
