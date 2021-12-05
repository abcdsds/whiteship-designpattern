package strategy;

public class Fastest implements Speed {
    @Override
    public void blueLight() {
        System.out.println("fastest speed 1");
    }

    @Override
    public void redLight() {
        System.out.println("fastest speed 2");
    }
}
