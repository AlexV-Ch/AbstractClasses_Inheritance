public class Manager implements Employee {
    private String name;
    private double salaryManager;
    private double salaryMonth;
    private double minValue = 115_000;
    private double maxValue = 140_000;

    public Manager(String name, double salaryManager) {
        this.name = name;
        this.salaryManager = salaryManager;
        this.salaryMonth = 0;
    }

    @Override
    public double getMonthSalary() {
        double income = (Math.random() * ((maxValue - minValue) + 1)) + minValue;
        return Math.round((salaryManager + (income * 0.05)) * 100) / 100;
    }

    public double getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salaryManager=" + salaryManager +
                ", salaryMonth=" + salaryMonth +
                '}';
    }
}
