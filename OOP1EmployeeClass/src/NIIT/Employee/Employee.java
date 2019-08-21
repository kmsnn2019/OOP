package NIIT.Employee;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        if (salary < 0)
            salary = -salary;

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0)
            salary = -salary;
        this.salary = salary;
    }

    public int getAnnualSalary()
    {
        return 12*this.salary;
    }

    public String getName(String firstName, String lastName, int salary)
    {
        return "Employee First and Last Name: " + this.firstName+" "+ this.lastName + "\nAnnual salary: " + 12*salary + "$";
    }

    public int raiseSalary(int percent)
    {
        if (percent < 0)
            percent = -percent;

        this.salary = this.salary*percent;

        return (this.salary + this.salary*percent/100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + firstName + " "+lastName + '\'' +
                ", salary=" + salary +
                " $}";
    }
}
