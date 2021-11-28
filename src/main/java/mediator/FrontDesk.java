package mediator;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService;

    private Restaurant restaurant;

    public FrontDesk(CleaningService cleaningService, Restaurant restaurant) {
        this.cleaningService = cleaningService;
        this.restaurant = restaurant;
    }

    public void getTowers(Guest guest, int numberOfTower) {
        cleaningService.getTower(this, guest.getId(), numberOfTower);
    }

    public String getRommNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(this, guest.getId(), dateTime);
    }

    public String getGymNameFor(Integer gymId) {
        return "Gym";
    }

    public void clean(Gym gym, LocalDateTime dateTime) {
        cleaningService.clean(this, gym.getId(), dateTime);
    }
}
