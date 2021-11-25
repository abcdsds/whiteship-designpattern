package interpreter;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
            자주 등장하는 문제를 간단한 언어로 정의하고 재사용하는 패턴.
            - 반복되는 문제 패턴을 언어 또는 문법으로 정의하고 확장할 수 있다.

            장점
            - SRP와 OCP가 지켜진다.
            단점
            - 무지 복잡

            구현해야 할지 말지 고민할때 구현 비용과 자주 쓸만한 패턴인지 ROI를 신경써서 고려하자.

         */



        PostfixExpression expression = PostfixParser.parse("xyz+-");
        Map<Character, Integer> map = new HashMap<>(); // context
        map.put('x', 1);
        map.put('y', 2);
        map.put('z', 3);
        int result = expression.interpret(map);
        System.out.println(result);
    }
}
