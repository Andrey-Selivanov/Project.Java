package hierarchy;

public abstract class Appliances {
    private String type;
    private String manufacter;
    private double size;
    String description = "Unknown appliances";

    public String getDescription() {
        return description;
    }
    public abstract double cost();

    public void Appliances(String type, String manufacter, double size) {
        this.type = type;
        this.manufacter = manufacter;
        this.setSize(size);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size <= 0) {
            System.out.println("Число задано неверно");
        } else {
            this.size = size;
        }
    }

    public String toString() {
        return "Тип товара - " + type + " Производитель - " + manufacter + " Размер - " + getSize();
    }

    public Object Description() {
        System.out.println(toString() + "");
        return null;
    }
}