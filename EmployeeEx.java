class Employee {
    private String name;
    int id;
    private double salary;

    // Employee(String name, int id, double salary) {
    // this.name = name;
    // this.id = id;
    // this.salary = salary;
    // }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setsalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("salary cannot be negative");
        }
    }

    public double getsalary() {
        return this.salary;
    }
}

public class EmployeeEx {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setname("pavan sai");
        e1.setsalary(12000.0);
        System.out.println(e1.getname());
        System.out.println(e1.getsalary());

    }

}
