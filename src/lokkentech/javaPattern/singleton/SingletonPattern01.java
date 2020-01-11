package lokkentech.javaPattern.singleton;

public class SingletonPattern01 {

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

    private SingletonPattern01() {
    }

}
