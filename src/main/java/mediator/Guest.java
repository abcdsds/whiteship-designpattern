package mediator;

import java.time.LocalDateTime;

public class Guest {

    private Integer id;

    private FrontDesk frontDesk;

    public Guest(Integer id, FrontDesk frontDesk) {
        this.id = id;
        this.frontDesk = frontDesk;
    }

    public Guest(Integer id) {
        this.id = id;
    }

    public void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    public Integer getId() {
        return this.id;
    }
}
