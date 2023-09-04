package Animal;

public enum Species {
    BEAR("Ведмідь ", "\uD83D\uDC3B", 500, 2, 5, 80, 40),
    EAGLE("Орел ", "\uD83E\uDD85", 6, 3, 20, 1, 0.5),
    FOX("Лиса ", "\uD83E\uDD8A", 8, 2, 30, 2, 1),
    SNAKE("Змія ", "\uD83D\uDC0D", 15, 1, 30, 3, 2),
    WOLF("Волк ", "\uD83D\uDC3A", 50, 3, 30, 8, 6),

    COW("Корова ", "\uD83D\uDC17", 700, 3, 10, 100, 50),
    DEER("Олень ", "\uD83E\uDD8C", 300, 4, 20, 50, 25),
    DUCK("Качка ", "\uD83E\uDD86", 1, 4, 200, 0.15, 1),
    GOAT("Коза ", "\uD83D\uDC10", 60, 3, 140, 10, 2),
    HAMSTER("Хомяк ", "\uD83D\uDC01", 0.05, 1, 500, 0.01, 1),
    HARE("Заяць ", "\uD83D\uDC07", 2, 2, 150, 0.45, 1.9),
    HORSE("Кінь ", "\uD83D\uDC0E", 400, 4, 20, 60, 30),
    BOAR("Кабан ", "\uD83D\uDC03", 400, 2, 50, 50, 25),
    SHEEP("Вівця ", "\uD83D\uDC11", 70, 3, 140, 15, 5),
    CATERPILLAR("Гусінь ", "\uD83D\uDC1B", 0.01, 0, 1000, 0, 0.5),

    HERB("Рослини ", "\uD83C\uDF3F", 1, 0, 200, 0, 0);

    public final String name;
    private final String picture;
    private final double weight;
    private final int speed;
    private final int countCell;
    private final double weightSatiety;
    private double satiety;

    Species(String name, String picture, double weight, int speed, int countCell, double weightSatiety, double satiety) {
        this.name = name;
        this.picture = picture;
        this.weight = weight;
        this.speed = speed;
        this.countCell = countCell;
        this.weightSatiety = weightSatiety;
        this.satiety = satiety;
    }

    public String getPicture() {
        return picture;
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