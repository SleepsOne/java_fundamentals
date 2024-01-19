public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employedId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employedId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retired() {

    }
}
