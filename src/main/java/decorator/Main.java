package decorator;

public class Main {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        /*
            런타임 시점에 기존 코드를 확장하는 패턴

            장점
            - 새로운 클래스를 만들지 않고 기존 기능을 조합할 수 있다.
              - 스팸과 필터링을 동시에 하는 스팸앤필터링 클래스가 만들어지는것이 아닌 기존 스팸과 필터링을 이용하여 사용
            - 컴파일 타임이 아닌 런타임에 동적으로 기능을 변경할 수 있다.
            단점
            - 데코레이터를 조합하는 코드가 복잡할 수 있다.
            - 조건마다 클래스가 생성되지만 기존의 상속으로 인한 클래스 생성보다는 덜 생성되기에 단점으로 추가는 안함.

         */

        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }


        Client client = new Client(commentService);
        client.writeComment("출력");
        client.writeComment("출력2...");
        client.writeComment("출력3http");
    }
}
