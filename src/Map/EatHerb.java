package Map;

public class EatHerb {
    SettingIsland settingIsland;

    public EatHerb(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }
    public void run(){
        for (int i  = 0; i < SettingIsland.COUNT_OF_MOVE; i++){
            settingIsland.eatHerb();
        }
    }
}
