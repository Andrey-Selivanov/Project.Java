package Factory_Method;

public class Main {
    public static void main(String[] args) {
        BakeFactory factory = new BakeFactory();
        Pizzeria bake = new Pizzeria(factory);
        bake.OrderBaking("PizzaPepperoni");
    }
}