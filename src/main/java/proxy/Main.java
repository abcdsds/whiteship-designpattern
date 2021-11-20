package proxy;

import proxy.way1.GameServiceProxy;
import proxy.way2.DefaultGameService;

public class Main {
    public static void main(String[] args) {
        /*
            특정 객체에 대한 접근을 제어하거나 기능을 추가
            - 초기화 지연, 접근 제어, 로깅, 캐싱 등 다양하게 으용해 사용할 수 있다.
            
            way1: 아예 기존 소스를 안건드리고 사용
            way2: 기존 소스를 수정 ( 데코레이터 패턴과 비슷함 )

            장점
            - 기존코드를 변경하지 않고 새로운 기능을 추가할 수 있다.
               - way1, 만약 기존 코드가 인터페이스라면 way2도 마찬가지
               - way1은 상속을 사용해서 단점이 존재
            - 기존 코드가 해야 하는 일만 유지할 수 있다.
            - 기능 추가 및 초기화 지연 등으로 다양하게 활용할 수 있다.
            단점
            - 코드의 복잡도가 증가한다.
            
            Java에서 제공하는 Refelct의 Proxy를 사용하면 기능이나 제어를 동적으로도 사용가능

         */

        //way1
        GameService gameService = new GameServiceProxy();
        gameService.startGame();

        //way2
        proxy.way2.GameService gameServiceProxy = new proxy.way2.GameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }
}
