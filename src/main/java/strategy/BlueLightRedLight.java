package strategy;

public class BlueLightRedLight {

    private Speed speed;

    public BlueLightRedLight(Speed speed) {
        this.speed = speed;
    }

    public void blueLight() {
        speed.blueLight();
    }

    public void redLight() {
        speed.redLight();
    }
}
