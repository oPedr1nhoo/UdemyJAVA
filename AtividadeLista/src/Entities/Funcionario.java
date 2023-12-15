package Entities;


public class Funcionario {

    private Integer id;
    private String name;
    private Double salary;

    public Funcionario(java.lang.Integer id, java.lang.String name, java.lang.Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentual){

    salary += salary * (percentual/100);

    }

    public String toString() {
        return "ID" id + ", " + name + ", " + String.format("%.2f", salary);
    }


}
