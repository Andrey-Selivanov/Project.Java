package hierarchy;

public class Main {
    public static void main(String[] args) {
    Appliances fridge = new Fridge("fridge", "Electrolux", 10, 100);
    Appliances vacuum = new Vacuum("vacuum", "LG", 11, "with wet cleaning");
    fridge.Description();
    vacuum.Description();

}
}
