package templatemethod;

import templatemethod.callback.Operator;

public class Main {
    public static void main(String[] args) {
        /*
            템플릿 메소드 패턴
                로직의 구조를 템플릿화 시켜 제공한다.
                로직의 구조를 서브 클래스가 확장할 수 있도록 템플릿으로 제공하는 패턴
                - 추상 클래스는 템플릿을 제공하고 하위 클래스는 구체적인 로직을 제공한다.
                - 로직이 대부분이 중복되고 몇몇 기능만 변경되는 경우에 사용

            장점
            - 템플릿 코드를 재사용하고 중복 코드를 줄일수 있다.
            - 템플릿 코드를 변경하지 않고 상속을 받아서 구체적인 로직만 변경 가능

            단점
            - LSP 를 위반
            - 로직이 복잡할수록 템플릿을 유지하기 어려워진다.
            
            템플릿 콜백 패턴
                콜백으로 상속 대신 위임을 사용하는 템플릿 패턴
                - 상속 대신 익명 내부 클래스 또는 람다 표현식을 활용할 수 있다.
                - 메소드는 하나만 사용한다.
                - 상속을 사용하지 않는다.


         */

        
        //템플릿 메소드 패턴
        FileProcessor plus = new Plus("number.txt");
        int process = plus.process();
        System.out.println(process);
        
        
        //템플릿 콜백 패턴
        templatemethod.callback.FileProcessor fileProcessor =
                new templatemethod.callback.FileProcessor("number.txt");
        fileProcessor.process((result, number) -> result+=number);

    }
}
