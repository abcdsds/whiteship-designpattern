package builder;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder.title("칸쿤 여행")
                .nightsAndDays(1, 2)
                .getPlan();
    }

    public TourPlan busanTrip() {
        return tourPlanBuilder.title("부산 여행")
                .nightsAndDays(3, 4)
                .getPlan();
    }
}
