package factorymethod;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        //validate(name, email);

        return createShip();
    }

    Ship createShip();

    //java 8은 안되고 9부터 private 허용
//    private void validate(String name, String email) {
//
//    }

}
