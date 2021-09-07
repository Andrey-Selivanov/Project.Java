package Factory_Method;

public class BakeFactory {
    public Bake createBake (String type){
    Bake bake = null;
    if ("PizzaPepperoni".equals(type)) {
        bake = new PizzaPepperoni();
        System.out.println("Готовится пицца пепперони");

    } else if ("PizzaBolognese".equals(type)) {
        bake = new PizzaBolognese();
        System.out.println("Готовится пицца болоньезе");

    } else if ("PizzaHawaiian".equals(type)) {
        bake = new PizzaHawaiian();
        System.out.println("Готовится пицца по гавайски");
    }
    return bake;
}
}
