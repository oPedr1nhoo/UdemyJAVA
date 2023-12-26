package entities;

public class Employee {

    private String name;
    private String email;
private Double salary;

    public Employee(java.lang.String name, java.lang.String email, java.lang.Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.Double getSalary() {
        return salary;
    }

    public void setSalary(java.lang.Double salary) {
        this.salary = salary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "name=" + name +
                ", email=" + email +
                ", salary=" + salary +
                '}';
    }
}
