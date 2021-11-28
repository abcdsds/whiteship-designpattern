package mediator;

import java.time.LocalDateTime;

public class CleaningService {

    public void clean(FrontDesk frontDesk, Integer gymId, LocalDateTime dateTime) {
        String gymNameFor = frontDesk.getGymNameFor(gymId);
        System.out.println("clean " + gymNameFor);
    }

    public void getTower(FrontDesk frontDesk, Integer guestId, int numberOfTower) {
        String rommNumberFor = frontDesk.getRommNumberFor(guestId);
        System.out.println("provide " + numberOfTower + " to " + rommNumberFor);
    }
}
