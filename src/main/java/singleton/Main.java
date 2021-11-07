package singleton;

public class Main {
    public static void main(String[] args) {
        Settings instance = Settings.getInstance();
        Settings instance1 = Settings.getInstance();

        System.out.println(instance == instance1);
    }
}
