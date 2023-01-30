package it.develhope.staticexercise.entities;

public class Employee {
    private String name;
    private String surname;
    private String address;

    public Employee(String newEmployeeName,String newEmployeeSurname, String newEmployeeAddress){
        this.name = newEmployeeName;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
