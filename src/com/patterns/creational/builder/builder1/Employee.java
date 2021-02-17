package com.patterns.creational.builder.builder1;

public class Employee {

    private String name;
    private String lastname;


    private Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static final class EmployeeBuilder {
        private String name;
        private String lastname;

        private EmployeeBuilder() {
        }

        public static EmployeeBuilder aEmployee() {
            return new EmployeeBuilder();
        }

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setLastname(lastname);
            return employee;
        }
    }
}
