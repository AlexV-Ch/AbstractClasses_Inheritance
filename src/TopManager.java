public class TopManager implements Employee {
    private double salaryTopManager;

    public TopManager(double salaryTopManager) {
        this.salaryTopManager = salaryTopManager;
    }

    @Override
    public double getMonthSalary() {
        if (Company.income > 10_000_000) {
            return salaryTopManager * 1.5;
        } else {
            return salaryTopManager;
        }
    }


}
