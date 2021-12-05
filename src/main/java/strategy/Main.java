package strategy;

public class Main {
    public static void main(String[] args) {
        /*
            여러 알고리즘 또는 로직을 캡슐화하고 상호 교환 가능하게 만드는 패턴
            - 컨텍스트에서 사용할 알고리즘 또는 로직을 클라이언트가 선택한다.

            장점
            - OCP
            - 상속 대신 위임 사용
            - 런타임에 전략을 변경할 수 있다.

            단점
            - 복잡도가 증가한다.
            - 전략을 클라이언트가 직접 알게 되서 의존성이 생긴다.
         */

        // 컴포지션만이 아닌 메소드의 필드로도 전략 주입 가능
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Normal());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();

        blueLightRedLight = new BlueLightRedLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue");
            }

            @Override
            public void redLight() {
                System.out.println("red");
            }
        });

    }
}
