package Abstract_Factory;

public class BurgerKing implements ShopFactory {
    @Override
    public Homemade createHomemade() {
        return new BurgerKingHomemade();
    }

    @Override
    public FactoryLevel createFactoryLevel() {
        return new BurgerKingFactoryLevel();
    }

}
