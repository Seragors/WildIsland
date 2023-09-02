package Map;

public class EatHerb extends Thread {
    SettingIsland settingIsland;

    public EatHerb(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }
    public void run(){
        for (int i  = 0; i < SettingIsland.COUNT_OF_MOVE; i++){
            settingIsland.eatHerb();
            try {
                Thread.sleep(SettingIsland.COUNT_OF_SLEEP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
