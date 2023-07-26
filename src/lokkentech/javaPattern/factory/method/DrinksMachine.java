package lokkentech.javaPattern.factory.method;

/**
 * 팩토리 패턴
 * 
 * 팩토리 패턴의 목적은 객체의 생성.
 * 객체를 생성하는 로직은 팩토리안에 감싸고, 생성한 객체를 반환하는 메소드를 제공 (팩토리 메소드 패턴)
 * 객체생성처리를 하위클래스에 위임 (추상 팩토리 패턴)
 * 
 * 상위, 하위클래스를 분리하여 클라이언트에 아무런 영향없이 실제 구현클래스를 변경가능하여
 * 결합도를 낮추고 유연성이 좋아지는 효과가 있다.
 * 
 * DrinksMachine 추상클래스를 상속한 하위클래스 CoffeeMachine, SoftDrinkMachine가 음료를 어떻게 결정하는지 짐작이 가능하다.
 * dispnseDrink의 리턴타입 Drink객체를 서비스할것이고 어떤타입의 음료를 내올지는 각 하위 클래스가 결정.
 * 
 */
public abstract class DrinksMachine {

    public abstract Drink dispenseDrink();

    public String displayMsg() {
        return "이용해주셔서 감사합니다.";
    }
}