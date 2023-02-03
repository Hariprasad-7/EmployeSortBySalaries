package org.example;

public class Employe {

    private int id;
    private String name;
    private String department;
    private double salary;

    Boolean isActive;

    public Employe() {
    }

    public Employe(int id, String name, String department, double salary) {
        this.isActive=true;
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", isActive=" + isActive +
                '}';
    }
}
