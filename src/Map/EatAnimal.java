package Map;

public class EatAnimal {
    SettingIsland settingIsland;

    public EatAnimal(SettingIsland settingIsland) {
        this.settingIsland = settingIsland;
    }
    public void run(){
        for (int i  = 0; i < SettingIsland.COUNT_OF_MOVE; i++){
            settingIsland.eatAnimals();
        }
    }

}
