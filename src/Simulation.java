import Map.*;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Simulation implements Runnable {
    public static boolean isRuning = true;

    @Override
    public void run() {
        SettingIsland island = new SettingIsland();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        Scanner cs = new Scanner(System.in);
        System.out.println("Введіть кількість днів життя острова: ");
        int cycle = cs.nextInt();
        int number = 0;
        while (isRuning) {
            executorService.submit(new Move(island));
            executorService.submit(new EatAnimal(island));
            executorService.submit(new EatHerb(island));
            executorService.submit(new Grass(island));
            executorService.submit(new Reproduction(island));
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (cycle <= number) {
                isRuning = false;
                executorService.shutdownNow();
                island.getStatistic();
            }
            number++;
        }
    }
}
