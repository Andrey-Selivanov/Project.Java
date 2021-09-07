package Factory_Method;

public class PizzaPepperoni extends Bake{
    public PizzaPepperoni () {
        name = " пиццы пепперони";
    }

    @Override
    public void Add() {
        System.out.println("Добавление колбасок пепперони");
    }
}
