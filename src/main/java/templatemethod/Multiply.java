package templatemethod;

public class Multiply extends FileProcessor{
    public Multiply(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int line) {
        return result *= line;
    }
}
