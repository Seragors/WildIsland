package Map;

public class Reproduction extends Thread {
    SettingIsland settingIsland;

    public Reproduction(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }

    public void run() {
        for (int i = 0; i < SettingIsland.COUNT_OF_MOVE; i++) {
            settingIsland.animalReproduction();
            try {
                Thread.sleep(SettingIsland.COUNT_OF_SLEEP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
