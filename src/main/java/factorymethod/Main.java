package factorymethod;

public class Main {
    public static void main(String[] args) {
        Ship whiteShipFactory = new WhiteShipFactory().orderShip("dd", "aa");
        Ship blackShipFactory = new BlackShipFactory().orderShip("dd","aa");

        System.out.println(whiteShipFactory);
        System.out.println(blackShipFactory);
    }
}
