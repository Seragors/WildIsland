package Animal;

import Map.Island;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Organism {

    private static final int DIRECTED = 4;
    private static final int DIRECTRX = 0;
    private static final int DIRECTLX = 1;
    private static final int DIRECTRY = 2;
    private static final int DIRECTLY = 3;
    private int Speed;
    private int maxCountCell;
    private double weightSatiety;
    private double satiety;
    private Gender sex;

    public Animal(Species species) {
        super(species);
        int i = new Random().nextInt(2);
        if (i == 1) {
            sex = Gender.FEMALE;
        } else {
            sex = Gender.MALE;
        }
        this.Speed = species.getSpeed();
        this.maxCountCell = species.getCountCell();
        this.weightSatiety = species.getSatiety();
        Island.cellList.get(indexCell).getAnimalList().add(Animal.this);
        Island.animalList.add(Animal.this);
    }

    public Animal(Cell cell, Species species) {
        super(cell, species);
        int i = new Random().nextInt(2);
        if (i == 1) {
            sex = Gender.FEMALE;
        } else {
            sex = Gender.MALE;
        }
        this.Speed = species.getSpeed();
        this.maxCountCell = species.getCountCell();
        this.weightSatiety = species.getSatiety();
        Island.cellList.get(indexCell).getAnimalList().add(Animal.this);
        Island.animalList.add(Animal.this);
    }

    @Override
    public void die() {
        if (satiety <= 0) {
            Island.animalList.remove(Animal.this);
            getCell().getAnimalList().remove(Animal.this);
            System.out.println(getName() + " загинув від голоду");
        }
    }

    public abstract Animal born();

    public abstract void eat();

    public synchronized void reproduction() {
        Animal child;
        if (sex.equals(Gender.FEMALE) && Island.cellList.get(indexCell).countSpecies(getSpecies()) < maxCountCell) {
            for (int i = 0; i < getCell().getAnimalList().size(); i++) {
                Animal coupe = getCell().getAnimalList().get(i);
                if (coupe.getSex().equals(Gender.MALE)) {
                    child = born();
                    i = getCell().getAnimalList().size() + 1;
                    System.out.println(getName() + " народила " + child.getName());
                }
            }
        }
    }

    public synchronized void move() {
        int speed = new Random().nextInt(Speed) + 1;
        int direct = new Random().nextInt(DIRECTED);
        int x = getCell().getX();
        int y = getCell().getY();
        int index = ((Island.x) * (y - 1) + x) - 1;
        if (direct == DIRECTRX) {
            x = getCell().getX() + speed;
        } else if (direct == DIRECTLX) {
            x = getCell().getX() - speed;
        } else if (direct == DIRECTRY) {
            y = getCell().getY() + speed;
        } else if (direct == DIRECTLY) {
            y = getCell().getY() - speed;
        }
        if (x <= 1) {
            x = 1;
        }
        if (x > Island.x) {
            x = Island.x;
        }
        if (y <= 1) {
            y = 1;
        }
        if (y > Island.y) {
            y = Island.y;
        }
        int newIndex = ((Island.x) * (y - 1) + x) - 1;
        if (Island.cellList.get(newIndex).countSpecies(getSpecies()) < maxCountCell) {
            Island.cellList.get(index).getAnimalList().remove(Animal.this);
            setCell(Island.cellList.get(newIndex));
            Island.cellList.get(newIndex).getAnimalList().add(Animal.this);
            if (newIndex == index) {
                System.out.println(getName() + " Не перемістився в комірку. ");
            } else System.out.println(getName() + " Перемістився в комірку: " + getCell());
        } else System.out.println(getName() + " Тісно в комірки ");
        if (newIndex != index) {
            setSatiety(getSatiety() - (getSatiety() * 10 * speed));
        } else {
            die();
        }
    }

    public int getMaxSpeed() {
        return Speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.Speed = maxSpeed;
    }

    public int getMaxCountCell() {
        return maxCountCell;
    }

    public void setMaxCountCell(int maxCountCell) {
        this.maxCountCell = maxCountCell;
    }

    public double getWeightSatiety() {
        return weightSatiety;
    }

    public void setWeightSatiety(double weightSatiety) {
        this.weightSatiety = weightSatiety;
    }

    public double getSatiety() {
        return satiety;
    }

    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "maxCountCell=" + maxCountCell +
                ", weightSatiety=" + weightSatiety +
                ", satiety=" + satiety +
                ", sex=" + sex +
                '}';
    }
}