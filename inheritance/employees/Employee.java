public class Employee {
    String employeeId;
    String employeeName;
    double basicSalary;
    double performanceRating;
    static double hraPercent = 20.0; // House Rent Allowance percentage
    static double pfPercent = 12.0;  // Provident Fund percentage
    static double allowanceRate = 5.0; // Other Allowances percentage
    Employee(String id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.basicSalary = salary;
    }
    public String toString() {
        return "Employee ID: " + employeeId + ", Employee Name: " + employeeName
                + ", Salary: " + basicSalary;
    }
    /*public final double computePayroll()
    {
        double hra = (hraPercent / 100) * basicSalary;
        double pf = (pfPercent / 100) * basicSalary;
        double allowance = (allowanceRate / 100) * basicSalary;
        return basicSalary + hra + allowance - pf;
    }*/
    public final double getGrossSalary() {
        double hra = (hraPercent / 100) * basicSalary;
        double allowance = (allowanceRate / 100) * basicSalary;
        return basicSalary + hra + allowanceRate - pf;
    }    
    public final double getNetSalary() {
        double pf = (pfPercent / 100) * basicSalary;
        return getGrossSalary() - pf;
    }
    public void increaseSalary() {
        
    }

}
