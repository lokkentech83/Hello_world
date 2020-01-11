package lokkentech.javaPattern.singleton;

public class SingletonPattern01 {

    /**
     * 멀티 스레드 환경에서는 잠재적 문제를 가지고 있다. 두 개 이상의 스레드가 인스턴스를 획득하기 위해 getInstance() 메서드에
     * 진입하여 경합을 벌이는 과정에서 서로 다른 두 개의 인스턴스가 만들어지는 형태가 발생할 여지가 있다.
     */

    // 인스턴스 선언
    private static SingletonPattern01 instance = null;

    // 인스턴스 취득
    public static SingletonPattern01 getInstance() {

        // 존재하지 않을 경우 새롭게 인스턴스를 생성하여 반환한다.
        if (instance == null) {
            instance = new SingletonPattern01();
        }

        return instance;
    }

    // construct의 은닉
    private SingletonPattern01() {
    }

}
