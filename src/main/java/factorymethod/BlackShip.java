package factorymethod;

public class BlackShip implements Ship{
    private String name;
    private int price;

    @Override
    public String toString() {
        return "BlackShip{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
