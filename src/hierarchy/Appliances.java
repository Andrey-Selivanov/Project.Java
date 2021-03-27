package hierarchy;

public class Appliances {
    private Double cost;
    private String type;
    private String manufacter;

    public void setCost(Double cost) {
        if (cost<=0){
            System.out.println("Цена отрицательная");
        } else{
            this.cost = cost;
        }
    }
    public Double getCost() {
        return cost;
    }
    Appliances(){
    this.cost = 1.;
    this.type = "";
    this.manufacter = "";
    }
    Appliances(double cost,String type,String manufacter){
        setCost(cost);
        this.type = type;
        this.manufacter = manufacter;

    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setManufacter(String manufacter){
        this.manufacter = manufacter;
    }
    public String getManufacter(){
        return manufacter;
    }
    public String getDiscription(){
        return "Цена" + cost + "Тип товара" + type + "Производитель" + manufacter;
    }

}
