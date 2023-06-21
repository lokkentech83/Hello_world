package lokkentech.javaPattern.facade;

/**
 * 퍼사드 패턴의 경우 복잡한 실행 흐름에 쉽게 접근할 수 있게 만드는 패턴
 * 코드 변경시 유지보수성이 좋아진다. 호출하는쪽에서는 기존 호출하던 wash를 그대로 호출할뿐
 * 비즈니스로직의 복잡도가 내려가는 등의 장점이 있음.
 */
public class FacadePattern01 {


    
    public class WashMachine {
        
        // 물온도
        private int temperature = 0;

        // 복잡한 내부 처리는 메소드 내부에서 처리되므로 호출만으로 기능을 표현
        public void washModeHeavy() {
            setTemperature(100);
            startWash();
        }

        public void washModeLight() {
            setTemperature(40);
            startWash();
        }

        // 빨래를 개시한다.
        private void startWash() {
            System.out.println("빨래를 시작합니다.");
        }


        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        
    }

    public static void main(String[] args) {
        FacadePattern01 f = new FacadePattern01();
        f.new WashMachine().washModeHeavy(); // 퍼사드 패턴의 사용
    }
    

}
