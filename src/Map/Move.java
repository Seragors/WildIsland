package Map;

public class Move extends Thread {
    SettingIsland settingIsland;

    public Move(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }

    public void run() {
        for (int i = 0; i < SettingIsland.COUNT_OF_MOVE; i++) {
            settingIsland.animalsMove();
            try {
                Thread.sleep(SettingIsland.COUNT_OF_SLEEP);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}
