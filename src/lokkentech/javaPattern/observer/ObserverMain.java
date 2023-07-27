package lokkentech.javaPattern.observer;

public class ObserverMain {
    public static void main(String[] args) {
    
        // 인스턴스 생성
        NewsAgency newsAgency = new NewsAgency();
        RadioChannel radioChannel = new RadioChannel();
        TvChannel tvChannel = new TvChannel();
        
        // 관리대상 채널에 등록하기.
        newsAgency.register(radioChannel);
        newsAgency.register(tvChannel);

        // 뉴스 추가
        newsAgency.addNews("Breaking news : ウクライナ戦＿終戦");
    }
}
