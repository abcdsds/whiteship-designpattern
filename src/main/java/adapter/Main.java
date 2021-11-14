package adapter;

import adapter.security.LoginHandler;
import adapter.security.UserDetailsService;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            어댑터 패턴
            - 기존 코드를 클라이언트가 사용하는 인터페이스의 구현체로 바꿔주는 패턴
            - 110v -> 220v 돼지코가 적절한 예
            
            코드를 수정할수 있는 상황이면 Account와 ACcountService를 수정 ( UserDetails와 UserDetailsService를 구현 )
            아닐 경우 별도로 AccountUserDetails와 AccountUserDetailsService를 생성하여 구현
         */

        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("abcdsds", "abcdsds");
        System.out.println(login);

        // collections
        List<String> strings = Arrays.asList("a", "b", "c"); // adaptee
        // target                                   adapter
        Enumeration<String> enumeration = Collections.enumeration(strings);

    }
}
