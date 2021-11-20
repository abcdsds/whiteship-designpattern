package flyweight;

public class Main {
    public static void main(String[] args) {
        /*
            자주 변하는 속성 ( 또는 외적인 속성 ) 과 변하지 않는 속성 ( 또는 내적인 속성 ) 을
            분리하고 재사용하여 메모리 사용을 줄일 수 있다.

            장점
            - 메모리를 줄일 수 있다.

            단점
            - 코드의 복잡도가 증가한다.

         */

        FontFactory fontFactory = new FontFactory();
        new Character('h', "white", fontFactory.getFont("nanum:12"));
        new Character('e', "white", fontFactory.getFont("nanum:12"));
        new Character('l', "white", fontFactory.getFont("nanum:12"));
        new Character('l', "white", fontFactory.getFont("nanum:12"));
        new Character('o', "white", fontFactory.getFont("nanum:12"));
    }
}
