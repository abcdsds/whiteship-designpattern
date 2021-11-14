package builder;

public class DefaultTourBuilder implements TourPlanBuilder{

    private String title;
    private int nights;
    private int days;

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return new TourPlan(title, nights, days);
    }
}
