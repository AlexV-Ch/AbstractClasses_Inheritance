public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setIncome(10_000_001);
        company.hire(new Operator("Operator1", 100));
        company.hire(new Operator("Operator2", 100));
        company.hire(new Manager("Manager1",300));
        company.hire(new Manager("Manager2",30000));
        company.hire(new TopManager("TopManager1",7500));
        company.hire(new TopManager("TopManager2",8550));





        company.hireAll(company.addOperator(180));
        company.hireAll(company.addManager(80));
        company.hireAll(company.addTopManager(10));
        company.getMonth(company.getStaff());
        System.out.println();
        company.fire();
        System.out.println();
        company.getTopSalaryStaff(5);
        company.getPrint(company.getStaff());



    }
}
