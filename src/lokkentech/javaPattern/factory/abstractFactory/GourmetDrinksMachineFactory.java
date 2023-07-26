package lokkentech.javaPattern.factory.abstractFactory;

import lokkentech.javaPattern.factory.method.CoffeeMachine;
import lokkentech.javaPattern.factory.method.DrinksMachine;
import lokkentech.javaPattern.factory.method.SoftDrinkMachine;

public class GourmetDrinksMachineFactory implements AbstractDrinksMacineFactory {

    @Override
    public DrinksMachine createCoffeeMachine() {
        return new CoffeeMachine();
    }

    @Override
    public DrinksMachine createSoftDrinkMachine() {
        return new SoftDrinkMachine();
    }
}
