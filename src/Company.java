import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Company {

    public static double income;   // Доход компании
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

    // найм одного сотрудника добавление 1 сотрудника в список
    public void hire(Employee employee) {
        staff.add(employee);
    }

    // найм сотрудников по списку
    public void hireAll(ArrayList<Employee> employes) {
        staff.addAll(employes);
    }

    // Удаление 50% сотрудников через одного
    public void fire() {
        Iterator<Employee> iterator = getStaff().iterator();
        int i = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (i == 0) {
               iterator.remove();
               i = 1;
            } else {
                i = 0;
            }
        }
    }  // Удаление

    // Начисление месячной зарплаты
    public void getMonth(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            employee.setSalaryMonth(employee.getMonthSalary());
        }
    }

    //Печать всего списка
    public void getPrint(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    public ArrayList<Employee> getTopSalaryStaff(int count) {
        Collections.sort(getStaff(), new EmployeeComparator());
       // System.out.println(getStaff());
        return null;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {

        return null;
    }

    // Создание списка Операторов для приема на работу
    public ArrayList<Employee> addOperator(int number) {
        ArrayList<Employee> newOperator = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            newOperator.add(new Operator("Operator_" + i, 150));
        }
        return newOperator;
    }

    // Создание списка Менеджеров для приема на работу
    public ArrayList<Employee> addManager(int number) {
        ArrayList<Employee> newManager = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            newManager.add(new Manager("Manager_" + i, 550));

        }
        return newManager;
    }

    // Создание списка ТопМенеджеров для приема на работу
    public ArrayList<Employee> addTopManager(int number) {
        ArrayList<Employee> newTopManager = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            newTopManager.add(new TopManager("TopManager_" + i, 9550));

        }
        return newTopManager;

    }
}
