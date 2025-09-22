public class Manager extends Employee {
    Manager(String empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary);
    }
    @Override
    public void increaseSalary() {
        double increment = 0.30 * basicSalary; // 30% increment
        basicSalary += increment;        
    }
    @Override
    public String toString() {
        return "Manager: " + super.toString();
    }
    
}
