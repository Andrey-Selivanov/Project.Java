package hierarchy;

public class Fridge extends Appliances{
    private double height;
    Fridge (String type, String manufacter, double size, double height) {
        super.Appliances(type,manufacter, size);
        this.setHeight(height);
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
        else {
            System.out.println("Высота отрицательная");
        }
    }
    @Override
    public void Description() {
        System.out.println(toString() + "Высота стенок - " + height);
    }
}
