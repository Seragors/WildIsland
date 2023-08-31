package Animal;

public enum Species {
    BEAR("Ведмідь ", 500, 2, 5, 80, 50),
    EAGLE("Орел ", 6, 3, 20, 1, 0.5),
    FOX("Лиса ", 8, 2, 30, 2, 1.5),
    SNAKE("Змія ", 15, 1, 30, 3, 1),
    WOLF("Волк ", 50, 3, 30, 8, 2),

    COW("Корова ", 700, 3, 10, 100, 60),
    DEER("Олень ", 300, 4, 20, 50, 30),
    DUCK("Качка ", 1, 4, 200, 0.15, 0.1),
    GOAT("Коза ", 60, 3, 140, 10, 6),
    HAMSTER("Хомяк ", 0.05, 1, 500, 0.01, 0.05),
    HARE("Заяць ", 2, 2, 150, 0.45, 0.3),
    HORSE("Кінь ", 400, 4, 20, 60, 40),
    KANGAROO("Кенгуру ", 400, 2, 50, 50, 30),
    SHEEP("Вівця ", 70, 3, 140, 15, 8),
    CATERPILLAR("Гусінь ", 0.01, 0, 1000, 0, 0),

    HERB("Рослини ", 1, 0, 200, 0, 0);

    private final String name;
    private final double weight;
    private final int speed;
    private final int countCell;
    private final double weightSatiety;
    private double satiety;

    Species(String name, double weight, int speed, int countCell, double weightSatiety, double satiety) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.countCell = countCell;
        this.weightSatiety = weightSatiety;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCountCell() {
        return countCell;
    }

    public double getWeightSatiety() {
        return weightSatiety;
    }

    public double getSatiety() {
        return satiety;
    }
    public void setSatiety(double satiety) {
        this.satiety = satiety;
    }
}