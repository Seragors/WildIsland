package Map;

import Animal.Herbivore.*;
import Animal.Predator.*;
import Animal.Species;

public class SettingIsland {
    public static final int X = 100;
    public static final int Y = 20;
    public static final int COUNT_OF_MOVE = 2;
    public static final int COUNT_OF_SLEEP = 1000;

    public SettingIsland() {
        new Island(X, Y);
        for (int i = 0; i < Species.HERB.getCountCell(); i++) {
            new Herb();
        }
        for (int i = 0; i < Species.WOLF.getCountCell(); i++) {
            new Wolf();
        }
        for (int i = 0; i < Species.SNAKE.getCountCell(); i++) {
            new Snake();
        }
        for (int i = 0; i < Species.FOX.getCountCell(); i++) {
            new Fox();
        }
        for (int i = 0; i < Species.BEAR.getCountCell(); i++) {
            new Bear();
        }
        for (int i = 0; i < Species.EAGLE.getCountCell(); i++) {
            new Eagle();
        }
        for (int i = 0; i < Species.HORSE.getCountCell(); i++) {
            new Horse();
        }
        for (int i = 0; i < Species.DEER.getCountCell(); i++) {
            new Deer();
        }
        for (int i = 0; i < Species.HARE.getCountCell(); i++) {
            new Hare();
        }
        for (int i = 0; i < Species.HAMSTER.getCountCell(); i++) {
            new Hamster();
        }
        for (int i = 0; i < Species.GOAT.getCountCell(); i++) {
            new Goat();
        }
        for (int i = 0; i < Species.SHEEP.getCountCell(); i++) {
            new Sheep();
        }
        for (int i = 0; i < Species.BOAR.getCountCell(); i++) {
            new Boar();
        }
        for (int i = 0; i < Species.COW.getCountCell(); i++) {
            new Cow();
        }
        for (int i = 0; i < Species.DUCK.getCountCell(); i++) {
            new Duck();
        }
        for (int i = 0; i < Species.CATERPILLAR.getCountCell(); i++) {
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
            if (Island.animalList.get(i) instanceof Predator) {
                Island.animalList.get(i).eat();
            }
        }
    }

    public synchronized void eatHerb() {
        for (int i = 0; i < Island.animalList.size(); i++) {
            if (Island.animalList.get(i) instanceof Herbivore) {
                Island.animalList.get(i).eat();
            }
        }
    }

    public synchronized void animalReproduction() {
        for (int i = 0; i < Island.animalList.size() / 2; i++) {
            Island.animalList.get(i).reproduction();
        }
    }

    public void getStatistic() {
        System.out.println("На острові: " + Island.herbList.size() + " Рослин, " + countHerbivore() + " Травоїдних, " + countPredator() + " Хижаків.");
    }
}
