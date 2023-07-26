package lokkentech.javaPattern.decorator;

public abstract class Extra implements Order {

    protected Order order;
    protected String label;
    protected double price;

    public Extra(String label, double price, Order order) {
        
        this.label = label;
        this.price = price;
        this.order = order;
        System.out.println("constructor : " + label + ", " + price);
    }

    public abstract double getPrice();

    public String getLabel() {
        return order.getLabel() + ", " + this.label;
    }

    
}
