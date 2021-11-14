package builder;

public class Main {
    public static void main(String[] args) {
        TourPlanBuilder defaultTourBuilder = new DefaultTourBuilder();
        TourPlan 칸쿤_여행 = defaultTourBuilder.title("칸쿤 여행")
                .nightsAndDays(1, 2)
                .getPlan();

        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = tourDirector.busanTrip();
    }
}
