package hierarchy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

    Appliances[] myAppliances = new Appliances[10];

    Random random = new Random();
    for(int i = 0; i <= 9; i++) {
        int j = random.nextInt(2) +1;
        switch (j) {
            case (1):
                myAppliances[i] = new Fridge("fridge", "electrolux",10,100);
                break;
            case (2):
                myAppliances[i] = new Vacuum("vacuum", "lg", 11, "with wet cleaning");
        }
    }
    for(int i = 0; i <= 9; i++) {
        myAppliances[i].Description();
    }

    Appliances appliances = new Fridge("fridge", "electrolux",10,100);
    appliances = new Function(appliances);
    System.out.println(appliances.getDescription() + " $" + appliances.cost());

    Appliances appliances1 = new Vacuum("vacuum", "lg", 11, "with wet cleaning");
    appliances1 = new Function(appliances1);
    appliances1 = new Draw(appliances1);

    System.out.println(appliances1.getDescription() + " $" + appliances1.cost());
}

}
