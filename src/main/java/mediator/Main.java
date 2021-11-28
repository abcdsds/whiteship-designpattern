package mediator;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        /*
            여러 객체들간의 의사소통을 추상화 시켜서 객체들간의 의존성과 결합도를 낮추는 패턴
            비행기들이 이륙이나 착륙을 할때 서로 간의 의사소통을 할수있게 도와주는 관제탑

            여러 객체들이 소통하는 방법을 캡슐화 하는 패턴
            - 여러 컴포넌트 간의 결합도를 중재자를 통해 낮출 수 있다.

            장점
            - 컴포넌트 코드를 변경하지 않고 새로운 중재자를 만들어 사용할 수 있다.
            - 각각의 컴포넌트 코드를 보다 간결하게 유지할 수 있다.
            단점
            - 중재자 역할을 하는 클래스의 복잡도와 결합도가 증가한다.
            
            Spring의 DispatcherServlet을 중재자 패턴으로 볼수 있다. ( 다만 의존성이 양방향이 아니라 단방향이다 )
            - 단방향이면 퍼사드아닌가 ?

         */


        FrontDesk frontDesk = new FrontDesk(new CleaningService(), new Restaurant());
        Guest guest = new Guest(1123, frontDesk);
        Gym gym = new Gym(99, frontDesk);

        guest.dinner(LocalDateTime.now());
        guest.getTowers(10);

        gym.clean(LocalDateTime.now());
    }
}
