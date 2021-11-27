package iterator;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
            내부 구현을 드러내지 않고 클라이언트가 내부 리스트를 순회할수 있도록 하는 패턴
            집합 객체 내부 구조를 노출시키지 않고 순회 하는 방법을 제공하는 패턴.
            - 집합 객체를 순회하는 클라이언트 코드를 변경하지 않고 다양한 순회 방법을 제공할 수 있다.

            장점
            - 집합 객체가 가지고 있는 객체들에 손쉽게 접근할 수 있다.
            - 일관된 인터페이스를 사용해 여러 형태의 집합 구조를 순회할 수 있다.
            단점
            - 클래스가 늘어나고 복잡도가 증가한다.

         */

        Board board = new Board();
        board.addPost("1");
        Thread.sleep(500);
        board.addPost("2");
        Thread.sleep(500);
        board.addPost("3");

        Iterator<Post> iterator = board.getDefaultIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getContent());
        }

        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getContent());
        }

        board.getRecentPostIterator().forEachRemaining(p -> System.out.println(p.getContent()));
    }
}
