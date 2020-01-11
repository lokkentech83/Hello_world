package lokkentech.javaPattern.singleton;

public class SingletonPattern04 {

    // 인스턴스 선언
    private static SingletonPattern04 instance = null;

    // 인스턴스 취득
    // LazyHolder.INSTANCE를 참조하는 순간 Class가 로딩되며 초기화가 진행된다.
    public static SingletonPattern04 getInstance() {
        return LazyHolder.INSTANCE;
    }

    // Class를 로딩하고 초기화하는 시점은 thread-safe를 보장하기 때문에 volatile이나 synchronized 같은 키워드가
    // 없어도 된다. 멀티스레드에서도 안전한 싱글턴 패턴
    private static class LazyHolder {
        private static final SingletonPattern04 INSTANCE = new SingletonPattern04();
    }

    // construct의 은닉
    private SingletonPattern04() {
    }

    // 참조 사이트
    // https://jungwoon.github.io/java/2019/08/11/Singleton-Pattern-with-Multi-Thread/

}
