package Map;

public class Reproduction {
    SettingIsland settingIsland;

    public Reproduction(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }
    public void run(){
        for (int i  = 0; i < SettingIsland.COUNT_OF_MOVE; i++){
            settingIsland.animalReproduction();
        }
    }
}
