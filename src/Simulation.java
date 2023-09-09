import Map.*;

import java.util.Scanner;

public class Simulation{
    public static boolean isRuning = true;

    public void open() throws InterruptedException  {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введіть кількість днів життя острова: ");
        int cycle = cs.nextInt();
        int number = 0;
        SettingIsland island = new SettingIsland();
        while (isRuning) {
            EatAnimal eatAnimal = new EatAnimal(island);
            eatAnimal.start();
            EatHerb eatHerb = new EatHerb(island);
            eatHerb.start();
            Reproduction reproduction = new Reproduction(island);
            reproduction.start();
            Grass grass = new Grass(island);
            grass.start();
            Move move = new Move(island);
            move.start();

            eatAnimal.join();
            eatHerb.join();
            reproduction.join();
            grass.join();
            move.join();

            island.getStatistic();
            number++;
            if (cycle <= number) {
                isRuning = false;
            }
        }
    }
}
