import java.util.ArrayList;


public class Company {

    public static double income;
    private ArrayList<Employee> staff;

    public Company() {
        staff = new ArrayList<>();
        income = 0;
    }
    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public void hire(Employee employee) {
        staff.add(employee);
    }

    public void hireAll(ArrayList<Employee> employes) {
        staff.addAll(employes);
    }

    public void fire(Employee employee) {
        // Удаление ????
    }

    // Печать месячной зарплаты для просто проверки
    public void getMonth(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getMonthSalary());
            employee.setSalaryMonth(employee.getMonthSalary());
        }
    }


    public ArrayList<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> monthSalary = new ArrayList<>();
        monthSalary.addAll(getStaff());
        for (Employee employee : getStaff()) {
            System.out.println(employee);
        }
        System.out.println();
        for (Employee employee : monthSalary) {
            System.out.println(employee);
        }

        return null;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {

        return null;
    }



}
