package hierarchy;

public class Function extends Decorator {
    Appliances appliances;
    public Function(Appliances appliances) {
        this.appliances = appliances;
    }

    @Override
    public double cost() {
        return 60000 + appliances.cost();
    }
    @Override
    public String getDescription() {
        return appliances.description + " With function smart home";
    }

}
