package visitor;

public class Triangle implements Shape {

    @Override
    public void accpet(Device device) {
        device.print(this);
    }
}
