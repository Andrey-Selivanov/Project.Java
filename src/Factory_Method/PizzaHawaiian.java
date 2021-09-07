package Factory_Method;

public class PizzaHawaiian extends Bake{
    public PizzaHawaiian () {
        name = " пиццы по гавайски";
    }

    @Override
    public void Add() {
        System.out.println("Добавление ананасов");
    }
}
