package Map;

public class Move {
    SettingIsland settingIsland;

    public Move(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }

    public void run(){
        for (int i = 0; i < SettingIsland.COUNT_OF_MOVE; i++){
            settingIsland.animalsMove();
        }
    }
}
