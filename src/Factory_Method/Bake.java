package Factory_Method;

public class Bake {String name;

    public void Sourdough() {
        System.out.println("Процесс закваски");
    }

    public void Kneading() {
        System.out.println("Перемешивание");
    }

    public void Rest() {
        System.out.println("Отдых");
    }
    public void Add(){
        System.out.println("Добавление ингридиента");
}
    public void Baking() {
        System.out.println("Запекание");
    }

    public void Cut() {
        System.out.println("Нарезание");
    }
}
