package factorymethod;

public class WhiteShip implements Ship {
    private String name;
    private String price;

    @Override
    public String toString() {
        return "WhiteShip{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
