package Factory_Method;

public class PizzaBolognese extends Bake{
    public PizzaBolognese () {
        name = "пиццы болоньезе";
    }

    @Override
    public void Add() {
        System.out.println("Добавление фарша");
    }
}
