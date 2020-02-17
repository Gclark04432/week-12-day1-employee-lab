package employee.management;

import employee.Employee;

public class Manager extends Employee {
    private String departmentName;

    public Manager(String name, String NINumber, int Salary, String departmentName){
        super(name, NINumber, Salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }
}
