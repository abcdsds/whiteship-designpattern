package abstractfactory;


import factorymethod.Ship;

public class Main {

    /*  abstract factory 패턴은 factory method 패턴 보다 유연함
        중간에 필드 ( 상태 ) 를 넣어서 변화시킬수 있기 떄문
        하지만 둘다 파일이 늘어나는건 마찬가지지만 이게좀 덜늘어난다.
        
        관점
        fm -> 팩토리를 구현하는 방법에 초점 ( inheritance )
        af -> 팩토리를 사용하는 방법에 초점 ( composition )
        
        목적
        fm -> 구체적인 객체 생성과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적
        af -> 여러 관련있는 객체들을 구체적인 클래스에 의존하지 않고 만들수 있게 해주는 것이 목적
     */
    public static void main(String[] args) {
        ShipFactory whiteShipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = whiteShipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
