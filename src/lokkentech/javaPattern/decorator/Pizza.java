package lokkentech.javaPattern.decorator;

public class Pizza implements Order {

    private double price;
    private String label;

    public Pizza(String label, double price) {
        this.label = label;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getLabel() {
        return this.label;
    }
    
}
