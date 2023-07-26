package lokkentech.javaPattern.decorator.road;

public class RoadMain {
 
    public static void main(String[] args) {
        
        Display d = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));
        d.draw(); // 1 roadDisplay draw, 2 trafficDeco draw, 3 laneDeco draw
    }
}
