package singleton;

public class Settings {
    private static volatile Settings instance;

    private Settings(){}

    //double checked locking
    public static Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
