package visitor;

public class Circle implements Shape {
    @Override
    public void accpet(Device device) {
        device.print(this);
    }
}
