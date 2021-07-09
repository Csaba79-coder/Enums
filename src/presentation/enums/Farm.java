package presentation.enums;

public class Farm {

    public static void main(String[] args) {
        Chicken chicken = new Chicken("Chicken", "Chicky", ChickenLifeStage.EGG);

        System.out.println(chicken);
        System.out.println();

        System.out.println("Life stages are...");
        System.out.println(getChickenLifeStages());
    }

    public static String getChickenLifeStages() {
        ChickenLifeStage[] lifeStages = ChickenLifeStage.values();

        StringBuilder b = new StringBuilder();

        for (ChickenLifeStage lifeStage : lifeStages) {
            b.append(lifeStage.name()).append(" (");
            b.append(lifeStage.ordinal()).append(")").append("\n");
        }

        return b.toString();
    }

}
