package mediator;

import java.time.LocalDateTime;

public class Restaurant {

    public void dinner(FrontDesk frontDesk, Integer id, LocalDateTime dateTime) {
        String rommNumberFor = frontDesk.getRommNumberFor(id);
        System.out.println("dinner at the " + rommNumberFor + " at " + dateTime);
    }
}
