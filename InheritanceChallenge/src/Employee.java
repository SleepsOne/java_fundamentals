public class Employee extends Worker{
    private long employedId;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employedId, String hireDate) {
        super(name, birthDate, endDate);
        this.employedId = employedId;
        this.hireDate = hireDate;
    }

}
