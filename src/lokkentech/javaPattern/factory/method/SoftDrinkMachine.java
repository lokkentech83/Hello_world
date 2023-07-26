package lokkentech.javaPattern.factory.method;

public class SoftDrinkMachine extends DrinksMachine {

    @Override
    public Drink dispenseDrink() {
        return new SoftDrink();
    }
  
}
