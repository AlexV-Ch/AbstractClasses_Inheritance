import java.util.ArrayList;


public class Company {

    private ArrayList<Employee> staff;

    public Company() {
        staff = new ArrayList<>();
    }

    public void hire(Employee employee) {
        staff.add(employee);
    }



    public ArrayList<Employee> getTopSalaryStaff(int count) {

        return null;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {

        return null;
    }
}
