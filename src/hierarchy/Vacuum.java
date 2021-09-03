package hierarchy;

public class Vacuum extends Appliances {
    private  String species;

    Vacuum (String type, String manufacter, double size, String species) {
        super.Appliances(type, manufacter, size);
        this.species = species;
    }
    @Override
    public void Description() {
        System.out.println(toString() + " Вид пылесоса " + species);
    }
}
