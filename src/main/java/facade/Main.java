package facade;

public class Main {
    public static void main(String[] args) {
        /*
            클라이언트가 사용해야 하는 복잡한 서브 시스템 의존성을 간단한 인터페이스로 추상화 할 수 있다.

            장점
            - 서브 시스템에 대한 의존성을 한곳으로 모을 수 있다.
               - 다른곳에서 사용하려고 할때 퍼사드 클래스를 사용하면 편함
               - 추상화 시키는 장점도 존재
            단점
            - 퍼사드 클래스가 서브 시스템에 대한 모든 의존성을 가지게 된다.

         */

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("abcd");
        emailMessage.setTo("kisun");
        emailMessage.setSubject("hi");
        emailMessage.setText("good");
        emailSender.sendEmail(emailMessage);
    }
}
