import Map.*;

import java.util.Scanner;

public class Simulation{
    public static boolean isRuning = true;

    public void open() throws InterruptedException  {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введіть кількість тактів життя острова: ");
        int cycle = cs.nextInt();
        int number = 0;
        SettingIsland island = new SettingIsland();
        while (isRuning) {
            Move move = new Move(island);
            move.start();
            EatAnimal eatAnimal = new EatAnimal(island);
            eatAnimal.start();
            EatHerb eatHerb = new EatHerb(island);
            eatHerb.start();
            Reproduction reproduction = new Reproduction(island);
            reproduction.start();
            Grass grass = new Grass(island);
            grass.start();

            move.join();
            eatAnimal.join();
            eatHerb.join();
            reproduction.join();
            grass.join();

            island.getStatistic();
            number++;
            if (cycle <= number) {
                isRuning = false;
            }
        }
    }
}
