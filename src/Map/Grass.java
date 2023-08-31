package Map;

public class Grass {
    SettingIsland settingIsland;

    public Grass(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }

    public void run() {
        for (int i = 0; i < SettingIsland.COUNT_OF_MOVE; i++) {
            for (int j = 0; j < SettingIsland.COUNT_OF_HERB; j++) {
                if (Island.herbList.size() < SettingIsland.COUNT_OF_HERB) {
                    new Herb();
                }
            }
        }
    }
}
