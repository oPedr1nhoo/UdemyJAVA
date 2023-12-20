package entities;

public class Employee {

    private String name;
    private Integer hours;

    private Double valuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.Integer getHours() {
        return hours;
    }

    public void setHours(java.lang.Integer hours) {
        this.hours = hours;
    }

    public java.lang.Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(java.lang.Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return hours * valuePerHour;
    }
}
