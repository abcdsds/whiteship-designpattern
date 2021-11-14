package factorymethod;

import abstractfactory.Anchor;
import abstractfactory.Wheel;

public interface Ship {
    Anchor getAnchor();
    Wheel getWheel();
    String toString();
}
