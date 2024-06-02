import java.time.Year;

class Employee extends Person {
    private int hireYear;
    private String companyName;
    private double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireYear, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireYear = hireYear;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return Year.now().getValue() - hireYear;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public String getCompanyName() {
        return companyName;
    }
}