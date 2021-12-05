package strategy;

public class Faster implements Speed{
    @Override
    public void blueLight() {
        System.out.println("Faster speed 1");
    }

    @Override
    public void redLight() {
        System.out.println("Faster speed 2");
    }
}
