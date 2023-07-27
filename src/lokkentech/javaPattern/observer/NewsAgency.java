package lokkentech.javaPattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 어떤 객체가 자기 상태값을 바꿀때 다른 객체들에게 그 사실을 알리기 위한 패턴
 * 자기 상태를 바꾸는 객체를 주체(subject), 상태가 변경되었음을 통보받는 객체를 옵저버(observer)
 * 
 * 채팅같은경우 polling등으로 주체의 상태를 계속 확인한다면 리소스가 낭비된다.
 * 채팅창에 메시지를 작성하고 push하여 다른 채팅유저에게 알리는것이 효율적.
 * 
 * thread safe한 옵저버 패턴...
 * https://www.techyourchance.com/thread-safe-observer-design-pattern-in-java/
 * 
 * Observer interface를 이용하여 간단히 구현할수 있다. 
 * 인터페이스
 * 
 */
public class NewsAgency extends Observable implements Publisher {
    
    // 옵저버(통보를 받을 객체)를 관리하는 리스트
    private List<Observer> channels = new ArrayList<>();

    public void addNews(String newsItem) {
        notifyObservers(newsItem);
    }

    public void notifyObservers(String newsItem) {
        System.out.println("notify observer");
        for (Observer observer : channels) {
            observer.update(this, newsItem);
        }
    }

    public void register(Observer observer) {
        channels.add(observer);
    }

}
