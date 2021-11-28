package mediator;

import java.time.LocalDateTime;

public class Gym {

    private Integer id;

    private FrontDesk frontDesk;

    public Gym(Integer id, FrontDesk frontDesk) {
        this.id = id;
        this.frontDesk = frontDesk;
    }

    public Gym(Integer id) {
        this.id = id;
    }

    public void clean(LocalDateTime dateTime) {
        frontDesk.clean(this, dateTime);
    }

    public Integer getId() {
        return id;
    }
}
