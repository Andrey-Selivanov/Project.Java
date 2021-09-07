package Factory_Method;

public class Pizzeria {
    private final BakeFactory bakeFactory;

    public Pizzeria(BakeFactory bakeFactory) {
        this.bakeFactory = bakeFactory;
    }
    public Bake OrderBaking(String type) {
        Bake baking;
        baking = bakeFactory.createBake(type);
        baking.Sourdough();
        baking.Kneading();
        baking.Rest();
        baking.Add();
        baking.Baking();
        baking.Cut();

        System.out.println("Ваш заказ готов!");
        return baking;
    }
}
