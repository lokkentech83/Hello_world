package lokkentech.javaPattern.factory.abstractFactory;

import lokkentech.javaPattern.factory.method.DrinksMachine;

/**
 * 추상팩토리는 객체생성로직을 효과적으로 감추는 방법이다.
 * 객체생성 로직이 복잡할수록 팩토리를 거쳐 객체를 생성하는 편이 좋다.
 * 
 * 하지만 최신 프레임워크에는 내장된 컨테이너가 객체를 관리하는 시대이므로 거의 사용되지 않는다.
 */
public interface AbstractDrinksMacineFactory {
    public DrinksMachine createCoffeeMachine();
    public DrinksMachine createSoftDrinkMachine();
}