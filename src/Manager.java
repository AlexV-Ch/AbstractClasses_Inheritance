public class Manager implements Employee {
    private double salaryManager;

    public Manager(double salaryManager) {
        this.salaryManager = salaryManager;
    }

    @Override
    public double getMonthSalary() {
        return salaryManager;
    }
}
