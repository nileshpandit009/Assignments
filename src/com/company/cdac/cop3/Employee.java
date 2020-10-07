package com.company.cdac.cop3;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate dateOfJoining;
    private double salary;
    private Address address;

    public Employee() {
    }

    public Employee(String name, LocalDate dateOfJoining, double salary, Address address) {
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddressString() {
        return address.toString();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
