import java.time.Year;

abstract class Person {
    private String firstName;
    private String lastName;
    private int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge() {
        return Year.now().getValue() - birthdayYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }
}