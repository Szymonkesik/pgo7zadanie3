public class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireYear, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager: " + getFirstName() + " " + getLastName() +" "+
                "age " + getAge() +" "+
                "firma: " + getCompanyName() +" "+
                "rok zatrudnienia: " + getHireYear() +" "+
                "has salary " + getSalary();
    }
}