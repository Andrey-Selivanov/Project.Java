package hierarchy;

public class Vacuum extends Appliances {
    private String species;

    Vacuum(String type, String manufacter, double size, String species) {
        super.Appliances(type, manufacter, size);
        this.species = species;
    }

    public double cost() {
        return 20.1;
    }

    @Override
    public Object Description() {
        System.out.println(toString() + " Вид пылесоса " + species);
        return null;
    }

}