public class Main {
    public static void main(String[] args) {
        Company company = new Company(); // Создаем компанию
        company.setIncome(10_000_001);   // Устанавливаем доход компании
        System.out.println("Доход компании " + company.getIncome()); // Печать доход компании
        // Набираем единичных сотрудников
        company.hire(new Operator("Operator1", 100));
        company.hire(new Operator("Operator2", 100));
        company.hire(new Manager("Manager1",300));
        company.hire(new Manager("Manager2",30000));
        company.hire(new TopManager("TopManager1",7500));
        company.hire(new TopManager("TopManager2",8550));
        // Набираем сотрудников по списку
        company.hireAll(company.addEmployees(3,180));
        company.hireAll(company.addEmployees(2,80));
        company.hireAll(company.addEmployees(1,10));
        // Начисляем ЗП
        company.getMonth(company.getStaff());
        // Выводим 10 самых высоких ЗП
        company.getPrint(company.getTopSalaryStaff(10));
        System.out.println();
        // Выводим 30 самых низкиз ЗП
        company.getPrint(company.getLowestSalaryStaff(30));
        System.out.println();
        // Увольняем половину сотрудников
        company.fire();
        // Выводим 10 самых высоких ЗП
        company.getPrint(company.getTopSalaryStaff(15));
        System.out.println();
        // Выводим 30 самых низкиз ЗП
        company.getPrint(company.getLowestSalaryStaff(30));
        System.out.println();

        //Печать всех оставшихся сотрудников
        company.getPrint(company.getStaff());

    }
}
