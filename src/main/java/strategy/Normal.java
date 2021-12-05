package strategy;

public class Normal implements Speed{
    @Override
    public void blueLight() {
        System.out.println("normal speed 1");
    }

    @Override
    public void redLight() {
        System.out.println("normal speed 2");
    }
}
