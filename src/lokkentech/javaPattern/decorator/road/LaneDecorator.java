package lokkentech.javaPattern.decorator.road;

public class LaneDecorator extends DisplayDecorator {

    // 기존 표시 클래스의 설정
    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    // 부모클래스의 draw를 호출하고 신규기능 데코레이팅
    @Override
    public void draw() {
        super.draw();
        drawLane();
    }

    // 선 그리기 기능
    private void drawLane() {
        System.out.println("draw lane");
    }
    
}
