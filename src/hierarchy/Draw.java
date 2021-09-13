package hierarchy;

public class Draw extends Decorator{
    Appliances appliances;
    public Draw (Appliances appliances) {
        this.appliances = appliances;
    }
    @Override
    public String getDescription(){
        return appliances.description + " with drawing ";
    }

    @Override
    public double cost() {
        return 10 + appliances.cost();
    }
}
