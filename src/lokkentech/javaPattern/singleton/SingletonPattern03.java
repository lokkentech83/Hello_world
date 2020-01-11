package lokkentech.javaPattern.singleton;

public class SingletonPattern03 {

    /*
     * 인스턴스를 필요할 때 생성하지 않고, 처음부터 인스턴스를 만들어 버린다 멀티스레딩에 안전한 싱글톤 패턴 → 하지만 불필요한 리소스의 낭비가
     * 발생
     */
    // 인스턴스 선언
    private static SingletonPattern03 instance = null;

    // 인스턴스 취득
    // synchronized를 이용하여 동기화 → 성능저하가 발생한다.
    public synchronized static SingletonPattern03 getInstance() {

        // 존재하지 않을 경우 새롭게 인스턴스를 생성하여 반환한다.
        if (instance == null) {
            instance = new SingletonPattern03();
        }

        return instance;
    }

    // construct의 은닉
    private SingletonPattern03() {
    }
}
