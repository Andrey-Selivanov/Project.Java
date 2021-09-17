package Abstract_Factory;

public class KFC implements ShopFactory {
    @Override
    public Homemade createHomemade() {
        return new KFCHomemade();
    }

    @Override
    public FactoryLevel createFactoryLevel() {
        return new KFCFactoryLevel();

    }
}