package bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            추상적인 것과 구체적인 것을 분리하여 연결하는 패턴
            하나의 계층 구조일 때 보다 각기 나누었을때 독립적인 계층 구조로 발전 시킬 수 있다.
            SKIN concrete implementation
            CHAMPION Refined Abstraction

            장점
            - 추상적인 코드를 구체적인 코드 변경 없이도 독립적으로 확장
            - 추상적인 코드와 구체적인 코드를 분리할 수 있다.
            - OCP, SRP

            단점
            - 계층 구조가 늘어나 복잡도가 증가할 수 있다
         */

        Skin poolParty = new PoolParty();
        Champion ahri = new Ahri(poolParty);
        Champion akali = new Akali(poolParty);

        ahri.move();
        ahri.skill();

        akali.move();
        akali.skill();

        Skin kda = new KDA();
        Champion ahri1 = new Ahri(kda);
        Champion akali1 = new Akali(kda);

        ahri1.move();
        ahri1.skill();

        akali1.move();
        akali1.skill();

        /*
            JDBC는 브릿지코드가 적용된 예
            DRIVER 구현체쪽
            DRIVERMANAGER 추상화쪽
         */

        // driver에는 여러 구현체가 존재 ex) h2, mysql 등등
        Class.forName("org.h2.Driver");

        try(Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
            String sql = "CREATE TABLE xxxx";

            Statement statement = conn.createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        /*
            SLF4J도 브릿지코드가 적용된 예 ( 관점에 따라 다를 수 있음 )
            로깅 퍼사드가 추상화쪽
            로깅 퍼사드가 감싸고 있는 로거들이 구현체쪽 ( log4j, logback, log4j2 )
         */
    }

}
