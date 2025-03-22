public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.hire(new Operator(100));
        company.hire(new Operator(120));
        company.hire(new Manager(300));
        company.hire(new Manager(350));
        company.hire(new TopManager(500));
        company.hire(new TopManager(550));

    }
}
