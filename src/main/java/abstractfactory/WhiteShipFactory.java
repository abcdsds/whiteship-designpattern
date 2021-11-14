package abstractfactory;

import factorymethod.Ship;
import factorymethod.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory{

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        WhiteShip whiteShip = new WhiteShip();
        whiteShip.setWheel(shipPartsFactory.createWheel());
        whiteShip.setAnchor(shipPartsFactory.createAnchor());

        return whiteShip;
    }
}
