package lokkentech.javaPattern.singleton;

public class SingletonPattern02 {

    /*
     * 인스턴스를 필요할 때 생성하지 않고, 처음부터 인스턴스를 만들어 버린다 멀티스레딩에 안전한 싱글톤 패턴 → 하지만 불필요한 리소스의 낭비가
     * 발생
     */
    // 인스턴스 선언
    private static SingletonPattern02 instance = new SingletonPattern02();

    // 인스턴스 취득
    public static SingletonPattern02 getInstance() {
        return instance;
    }

    // construct의 은닉
    private SingletonPattern02() {
    }

}
