package lokkentech.javaPattern.decorator;

public class RegularExtra extends Extra {

    public RegularExtra(String label, double price, Order order) {
        super(label, price, order);
    }

    @Override
    public double getPrice() {
        System.out.println("--------Regular Extra getPrice START ");
        System.out.println("this.price " + this.price);
        System.out.println("order.getPrice " + order.getPrice());
        System.out.println("--------Regular Extra getPrice END");
        return this.price + order.getPrice();
    }

}
