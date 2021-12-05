package observer;

public class Main {
    public static void main(String[] args) {
        /*
            다수의 객체가 특정 객체 상태 변화를 감지하고 알림을 받는 패턴.
            어떤것들을 감지하고 상태의 변화를 지켜보는 패턴
            - 여러개의 객체들이 특정한 하나의 상태변화를 감지하고 반응을 해야 할때
            - pub sub 패턴 구현가능

            장점
            - 상태를 변경하는 객체(publisher)와 변경을 감지하는 객체(subscriber)의 관계를 느슨하게 유지할 수 있다.
            - Subject의 상태 변경을 주기적으로 조회하지 않고 자동으로 감지할 수 있다.
            - 런타임에 옵저버를 추가하거나 제거할 수 있다.

            단점
            - 복잡도가 증가한다.
            - 다수의 Observer 객체를 등록 이후 해지하지 않는다면 memory leak이 발생할 수도 있다.
              - map 에 담아놔서 참조중이라 GC가 되질 않는다.
              - hashmap 에는 weakReference 를 적용하는 경우가 많다. ( 해결책은 아니다 )
                - unregister 를 명시적으로 할수 없는경우
                - reference 가 다 사라져도 괜찮은 경우
                - 위 두가지 조건이 맞는 경우만 사용가능

         */

        ChatServer chatServer = new ChatServer();
        Subscriber user1 = new User("jds");
        Subscriber user2 = new User("tmo");

        chatServer.register("diablo", user1);
        chatServer.register("diablo", user2);

        chatServer.register("design", user1);

        chatServer.sendMessage(user1, "diablo", "offer item");
        chatServer.sendMessage(user2, "design", "sun pattern");

    }
}
