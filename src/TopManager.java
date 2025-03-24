public class TopManager implements Employee {
    private String name;
    private double salaryTopManager;
    private double salaryMonth;;

    public TopManager(String name, double salaryTopManager) {
        this.name = name;
        this.salaryTopManager = salaryTopManager;
        this.salaryMonth = 0;
    }

    @Override
    public double getMonthSalary() {
        if (Company.income > 10_000_000) {
            return salaryTopManager * 1.5;
        } else {
            return salaryTopManager;
        }
    }

    public double getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }
}
