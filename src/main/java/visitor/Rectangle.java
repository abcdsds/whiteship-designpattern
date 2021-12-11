package visitor;

public class Rectangle implements Shape{
    @Override
    public void accpet(Device device) {
        device.print(this);
    }
}
