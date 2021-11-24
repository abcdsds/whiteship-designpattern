package command;

public class Main {
    public static void main(String[] args) {
         /*
            요청을 캡슐화 하여 호출자 ( invoker )와 수신자 (receiver)를 분리하는 패턴.
            - 요청을 처리하는 방법이 바뀌더라도 호출자의 코드는 변경되지 않는다.
            - 다만 command interface 가 변경되면 안된다.

          */

        Button button = new Button(new LightOnCommand(new Light()));
        button.press();
        button = new Button(new LightOffCommand(new Light()));
        button.press();
        button = new Button(new GameStartCommand(new Game()));
        button.press();
        button = new Button(new GameEndCommand(new Game()));
        button.press();

    }
}
