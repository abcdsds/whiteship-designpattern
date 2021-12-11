package templatemethod;

public class Plus extends FileProcessor{
    public Plus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int line) {
        return result += line;
    }
}
