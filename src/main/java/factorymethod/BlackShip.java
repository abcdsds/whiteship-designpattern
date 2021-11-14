package factorymethod;

import abstractfactory.Anchor;
import abstractfactory.Wheel;

public class BlackShip implements Ship{
    private String name;
    private int price;


    @Override
    public Anchor getAnchor() {
        return null;
    }

    @Override
    public Wheel getWheel() {
        return null;
    }

    @Override
    public String toString() {
        return "BlackShip{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
