public class Engineer extends Employee {
    Engineer(String empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary);
    }
    @Override
    public void increaseSalary() {
        double increment = 0.20 * basicSalary; // 20% increment
        basicSalary += increment;        
    }
    @Override
    public String toString() {
        return "Engineer: " + super.toString();
    }
    
}
