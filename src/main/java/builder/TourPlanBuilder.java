package builder;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlan getPlan();
}
