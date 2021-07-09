package presentation.enums;

public enum ChickenLifeStage {

    TEST_CHICKEN(1),
    EGG(42, "funny", new Chicken("x", "xx", TEST_CHICKEN)),
    BABY_CHICK(42, "this is a funny name I guess, but not sure at all"),
    CHICKEN(42),
    HEN(42),
    FRIED(42);

    public final int NUMBER;

    ChickenLifeStage(int number) {
        NUMBER = number;
    }

    ChickenLifeStage(int number, String funName) {
        NUMBER = Math.max(funName.length(), number);
    }

    ChickenLifeStage(int number, String funName, Chicken chicken) {
        NUMBER = number;
    }

}
