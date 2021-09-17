package Iterator;

public class Main {
    public static Floor[] House;
    public static int total_area=0, area_floor=0, area_type;
    public static void main(String[] args) {
        House = new Floor[5];
        for (int i=0;i<5; i++)
        {
            House[i]=new Floor(i+1);
        }
        InfHouse();
        count_total_area();
        for (int i=0;i<5;i++) count_area_floor(i+1);
        for (int i=0;i<3;i++) count_area_type(i+1);
    }

    public static void InfHouse(){
        System.out.print("Высота здания - 5 этажей \n");
        for (int i=0;i<5;i++)
            System.out.printf("Этаж №%s: Количество квартир - %s \n", House[i].getNumber(), House[i].getCount());
        System.out.print("\n");
    }

    public static void count_total_area(){
        for (int i=0;i<5;i++){
            if ((i+1)==1) total_area+=House[i].count_square1();
            else total_area+=House[i].count_square();
        }
        System.out.printf("Общая жилая площадь = %s m^2 \n", total_area);
    }

    public static void count_area_floor(int nubmer){
        if ((nubmer)==1) area_floor=House[nubmer-1].count_square1();
        else area_floor=House[nubmer-1].count_square();
        System.out.printf("Общая жилая площадь этажа №%s = %s m^2 \n",nubmer, area_floor);
    }

    public static void count_area_type(int type){
        area_type=0;
        for (int i=0;i<5;i++){
            if ((i+1)==1) area_type+=House[i].count_square1(type);
            else area_type+=House[i].count_square(type);
        }
        System.out.printf("Общая площадь квартир с количеством комнат %s = %s m^2 \n",type, area_type);
    }
}
