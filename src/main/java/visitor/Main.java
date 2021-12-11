package visitor;

public class Main {
    public static void main(String[] args) {
        /*
            기존의 코드를 수정을 못할때 기능을 추가하길 원하는 상황에서 사용
            - 외부 서드파티 라이브러리를 사용하는 경우 ?
            - SRP 를 지키기 위해
            - 코드가 여러곳에서 비슷하게 작성될거 같을때

            기존코드를 변경하지 않고 새로운 기능을 추가하는 방법
            - 더블 디스패치를 활용할 수 있다. ( 토비님 유투부 영상에 나옴 )
              - 디스패치란 요청이 들어오면 요청을 처리할 구체적인 클래스 또는 메서드를 찾아서 배치하는 것
              - 다형성으로 이루어진 객체들을 알맞게 분배하는 것 ?


             장점
             - 기존코드를 수정하지않고 새로운 코드를 추가 가능
             단점
             - 무지 복잡하다 ( 더블 디스패치 )
             - 메서드 오버로딩은 컴파일 타임에 스태틱하게 컴파일되서 타입마다 메소드가 존재해야함.
             - element 부분에 해당하는 도형이 사라지면 코드 다 수정해야함.
             - 새로운 element 부분이 추가되도 다 수정해야함

         */

        Rectangle rectangle = new Rectangle();
        Device phone = new Phone();
        rectangle.accpet(phone);
    }
}
