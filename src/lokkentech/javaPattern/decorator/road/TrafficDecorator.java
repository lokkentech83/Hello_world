package lokkentech.javaPattern.decorator.road;

public class TrafficDecorator extends DisplayDecorator {

    public TrafficDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("traffic");
    }
    
    
}
