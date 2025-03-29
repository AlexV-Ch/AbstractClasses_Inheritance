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
        Collections.reverse(getStaff());
        ArrayList<Employee> lowestSalaryStaff = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lowestSalaryStaff.add(getStaff().get(i));
        }
        return lowestSalaryStaff;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(getStaff(), new EmployeeComparator());
        ArrayList<Employee> lowestSalaryStaff = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lowestSalaryStaff.add(getStaff().get(i));
        }
        return lowestSalaryStaff;
    }


// // Создание списка для приема на работу tip 1- ТопМенеджеров, 2-Менеджеров, 3-Операторов
    public ArrayList<Employee> addEmployees(int tip, int number) {
        ArrayList<Employee> newEmployees = new ArrayList<>();
        if (tip == 1) {
            for (int i = 0; i < number; i++) {
                newEmployees.add(new TopManager("TopManager_" + i, 9550));
            }
        } else if (tip == 2) {
            for (int i = 0; i < number; i++) {
                newEmployees.add(new Manager("Manager_" + i, 550));
            }
        } else if (tip == 3) {
            for (int i = 0; i < number; i++) {
                newEmployees.add(new Manager("Manager_" + i, 550));
            }
        } else {
            System.out.println("Такого типа " + tip +" сотрудников нет");
        }
        return newEmployees;
    }


}
