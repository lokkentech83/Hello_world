package lokkentech.javaPattern.factory.method;

public class CoffeeMachine extends DrinksMachine {

    public enum CoffeeType {
        ESPRESSO, LATTE
    }

    @Override
    public Drink dispenseDrink() {
        return new Coffee();
    }

    public Drink dispenseDrink(CoffeeType type) {
        Drink coffee = null;

        switch (type) {
            case ESPRESSO:
                coffee = new Espresso();
            case LATTE:
                coffee = new Latte();
        }

        return coffee;
    }

}