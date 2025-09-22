public class Manager extends Employee {
    Manager(String empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary);
    }
    // TODO : override increaseSalary
    @Override
    public String toString() {
        return "Manager: " + super.toString();
    }
    
}
