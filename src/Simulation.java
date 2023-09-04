import Map.*;

public class Simulation {
    public static boolean isRuning = true;
    public static int CYCLE = 10000;

    public void open() throws InterruptedException {
        SettingIsland island = new SettingIsland();
        while (isRuning) {
            EatAnimal eatAnimal = new EatAnimal(island);
            eatAnimal.start();
            EatHerb eatHerb = new EatHerb(island);
            eatHerb.start();
            Grass grass = new Grass(island);
            grass.start();
            Move move = new Move(island);
            move.start();
            Reproduction reproduction = new Reproduction(island);
            reproduction.start();

            eatAnimal.join();
            eatHerb.join();
            grass.join();
            move.join();
            reproduction.join();

            island.getStatistic();
            if (Island.animalList.size() > CYCLE) {
                isRuning = false;
            }
        }
    }
}
