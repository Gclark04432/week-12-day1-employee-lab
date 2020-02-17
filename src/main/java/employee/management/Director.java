package employee.management;

public class Director extends Manager {
    private double budget;

    public Director(String name, String NINumber, int Salary, String departmentName, double budget){
        super(name, NINumber, Salary, departmentName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }


    public double payBonus(){
        return this.getSalary() * 0.02;
    }
}
