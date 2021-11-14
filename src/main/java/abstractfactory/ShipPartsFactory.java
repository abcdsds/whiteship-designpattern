package abstractfactory;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
