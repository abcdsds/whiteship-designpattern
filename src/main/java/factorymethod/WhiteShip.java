package factorymethod;

import abstractfactory.Anchor;
import abstractfactory.Wheel;
import abstractfactory.WhiteAnchor;
import abstractfactory.WhiteWheel;

public class WhiteShip implements Ship {
    private String name;
    private String price;
    private Anchor anchor;
    private Wheel wheel;

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public Anchor getAnchor() {
        return anchor;
    }

    @Override
    public Wheel getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "WhiteShip{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
