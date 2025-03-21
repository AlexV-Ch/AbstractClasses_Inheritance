public class TopManager implements Employee {
    private double salaryTopManager;

    public TopManager(double salaryTopManager) {
        this.salaryTopManager = salaryTopManager;
    }

    @Override
    public double getMonthSalary() {
        return salaryTopManager;
    }
}
