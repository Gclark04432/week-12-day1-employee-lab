package employee;

public abstract class Employee {
    private String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;

        NINumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        this.salary += increase;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
