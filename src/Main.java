import Map.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SettingIsland island = new SettingIsland();

        EatAnimal eatAnimal = new EatAnimal(island);
        eatAnimal.start();
        EatHerb eatHerb = new EatHerb(island);
        eatHerb.start();
        Grass grass = new Grass(island);
        grass.start();
        Reproduction reproduction = new Reproduction(island);
        reproduction.start();
        Move move = new Move(island);
        move.start();

        eatAnimal.join();
        eatHerb.join();
        grass.join();
        reproduction.join();
        move.join();

        island.getStatistic();
    }
}