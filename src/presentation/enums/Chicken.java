package presentation.enums;

public class Chicken {

    private String name;
    private String nickName;
    private ChickenLifeStage lifeStage;

    public Chicken() {}

    public Chicken(String name, String nickName, ChickenLifeStage lifeStage) {
        this.name = name;
        this.nickName = nickName;
        this.lifeStage = lifeStage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public ChickenLifeStage getLifeStage() {
        return lifeStage;
    }

    public void setLifeStage(ChickenLifeStage lifeStage) {
        this.lifeStage = lifeStage;
    }

    @Override
    public String toString() {
        return name + " ("
                + nickName + ") "
                + "is at lifestage: " +
                lifeStage.name();
    }
}
