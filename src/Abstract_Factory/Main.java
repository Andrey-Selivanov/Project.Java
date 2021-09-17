package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        ShopFactory shopFactory;
        shopFactory = new KFC();
        shopFactory.createHomemade();

        ShopFactory shopFactory1;
        shopFactory1 = new BurgerKing();
        shopFactory1.createFactoryLevel();


    }
}
