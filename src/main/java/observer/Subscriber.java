package observer;

public interface Subscriber {
    void handleMessage(String message);
    String getName();
}
