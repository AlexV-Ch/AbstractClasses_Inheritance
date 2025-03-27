public class Operator implements Employee {
    private String name;
    private double salaryOperator;
    private double salaryMonth;

    public Operator(String name, double salaryOperator) {
        this.name = name;
        this.salaryOperator = salaryOperator;
        this.salaryMonth = 0;
    }

    @Override
    public double getMonthSalary() {
        return salaryOperator;
    }

    public double getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", salaryOperator=" + salaryOperator +
                ", salaryMonth=" + salaryMonth +
                '}';
    }
}
