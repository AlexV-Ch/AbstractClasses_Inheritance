public class Operator implements Employee {
    private double salaryOperator;

    public Operator(double salaryOperator) {
        this.salaryOperator = salaryOperator;
    }

    @Override
    public double getMonthSalary() {
        return salaryOperator;
    }

}
