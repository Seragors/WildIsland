package Map;

public class EatAnimal extends Thread{
    SettingIsland settingIsland;

    public EatAnimal(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }
    public void run(){
        for (int i  = 0; i < SettingIsland.COUNT_OF_MOVE; i++){
            settingIsland.eatAnimals();
            try {
                Thread.sleep(SettingIsland.COUNT_OF_SLEEP);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
