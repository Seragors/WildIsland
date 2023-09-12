package Map;

import Animal.Herbivore.Herb;
import Animal.Species;

public class Grass extends Thread {
    SettingIsland settingIsland;

    public Grass(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }

    public void run() {
        for (int i = 0; i < SettingIsland.COUNT_OF_MOVE; i++) {
            new Herb();
            try {
                Thread.sleep(SettingIsland.COUNT_OF_SLEEP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
