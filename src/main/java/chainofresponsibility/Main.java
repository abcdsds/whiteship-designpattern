package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        /*
            요청을 보내는 쪽과 요청을 처리하는 쪽을 분리하는 패턴
            핸들러 체인을 사용해서 요청을 처리한다.
            요청을 보내는 쪽은 어떤 핸들러를 사용하는지 알수가 없음.

            장점
            - OCP, SRP
            단점
            - flow가 늘어나서 디버깅하기 힘들어짐
            
            자바
            - 서블릿 필터
            스프링
            - 스프링 시큐리티 필터
         */


        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
        
    }
}
