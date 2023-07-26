package lokkentech.javaPattern.decorator.road;

// 다양한 추가기능에 대한 공통 클래스
public class DisplayDecorator extends Display {

    private Display decoratedDisplay;

    // 합성 관계 (composition) 를 통해 RoadDisplay에 대한 참조.
    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
    
}
