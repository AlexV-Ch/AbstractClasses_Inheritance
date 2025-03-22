public class Manager implements Employee {
    private double salaryManager;
    private double minValue = 115_000;
    private double maxValue = 140_000;

    public Manager(double salaryManager) {
        this.salaryManager = salaryManager;
    }

    @Override
    public double getMonthSalary() {
        double income = (Math.random() * ((maxValue - minValue) + 1)) + minValue;
        return salaryManager + (income * 0.05);
    }
}
