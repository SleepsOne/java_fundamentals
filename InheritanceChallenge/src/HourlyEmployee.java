public class HourlyEmployee extends Employee{
    private double hourlyPayDate;

    public HourlyEmployee(String name, String birthDate, String endDate, long employedId, String hireDate, double hourlyPayDate) {
        super(name, birthDate, endDate, employedId, hireDate);
        this.hourlyPayDate = hourlyPayDate;
    }

    public void getDoublePay(){

    }
}
