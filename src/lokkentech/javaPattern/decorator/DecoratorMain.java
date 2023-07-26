package lokkentech.javaPattern.decorator;

public class DecoratorMain {
    
    public static void main(String[] args) {
        // 피자주문 객체를 생성
        Order fourSeasonPizza = new Pizza("four season pizza", 10);
        // 생성한 피자객체를 인자값으로 넘겨주고 토핑을 얹은 새로운 객체 생성.
        fourSeasonPizza = new RegularExtra("pepperoni", 4, fourSeasonPizza); 
        fourSeasonPizza = new RegularExtra("onion", 3, fourSeasonPizza);
        fourSeasonPizza = new RegularExtra("motzarella", 2, fourSeasonPizza);

        System.out.println(fourSeasonPizza.getPrice());
        System.out.println(fourSeasonPizza.getLabel());
    }
}
