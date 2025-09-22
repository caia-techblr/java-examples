public class Engineer extends Employee {
    Engineer(String empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary);
    }
    // TODO : override increaseSalary
    @Override
    public String toString() {
        return "Engineer: " + super.toString();
    }
    
}
