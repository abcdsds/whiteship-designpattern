package composite;

public class Main {
    public static void main(String[] args) {
        /*
            트리구조로 작성해야함.
            그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴.
            클라이언트 입장에서는 "전체" 나 "부분" 이나 모두 동일한 컴포넌트로 인식할 수 있는 계층 구조를 만든다.

            장점
            - 복잡한 트리 구조를 편리하게 사용
            - 다형성과 재귀를 활용할 수 있다.
            - 클라이언트 코드를 변경하지 않고  새로운 엘리먼트 타입을 추가할 수 있다.
                - Item에 도란링이 추가 된다하더라도 printPrice는 변경되지 않는다. ( OCP )

            단점
            - 트리를 만들어야 하기 때문에 ( 공통된 인터페이스를 정의해야 하기 때문에 )
              지나치게 ( 억지로 ) 일반화를 해야 하는 경우도 생길 수 있다.
              ( 타입체크해야 하는 경우가 생기면 다시한번 생각해보자 )
         */



        Item 도란검 = new Item("도란검", 450);
        Item 체력물약 = new Item("체력물약", 50);

        Bag bag = new Bag();
        bag.add(도란검);
        bag.add(체력물약);

        Main main = new Main();
        main.printPrice(도란검);
        main.printPrice(체력물약);
        main.printPrice(bag);
    }

    // 가능한한 인터페이스 타입을 사용할수 있으면 사용해라
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
