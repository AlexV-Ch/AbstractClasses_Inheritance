import java.util.ArrayList;


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

    public void hireAll(ArrayList<Employee> employes) {
        staff.addAll(employes);
    }

    public void fire(Employee employee) {
        // Удаление ????
    }

    // Начисление месячной зарплаты
    public void getMonth(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            //System.out.println(employee.getSalaryMonth());
            employee.setSalaryMonth(employee.getMonthSalary());
            //System.out.println(employee.getSalaryMonth());
        }
    }

    //Печать всего списка
    public void getPrint(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }


    public ArrayList<Employee> getTopSalaryStaff(int count) {

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
