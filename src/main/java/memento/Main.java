package memento;

public class Main {
    public static void main(String[] args) {
        /*
            객체 내부의 상태를 외부에 저장해서 이 저장된 정보를 복원하고 싶을때 사용
            ex) undo, serializable

            캡슐화를 유지하면서 객체 내부 상태를 외부에 저장하는 패턴
            - 객체 상태를 외부에 저장했다가 해당 상태로 다시 복구할 수 있다.

           단점
           - 메멘토 객체가 많은 정보를 담고 있고 메멘도 객체를 자주 생성하면 메모리 사용량에 문제가 생긴다.
         */

        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);

        game.restore(save);

        System.out.println(game.getBlueTeamScore());
        System.out.println(game.getRedTeamScore());

    }
}
