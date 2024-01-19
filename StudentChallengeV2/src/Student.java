import java.util.Random;

public class Student implements QuerryItem, Comparable<Student>{
    private static int LAST_ID = 10_000;
    private int studentID;
    private String name;
    private String course;
    private int yearStarted;

    protected static Random random = new Random();

    private static String[] firstName = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};


    public Student() {
        this.studentID = LAST_ID++;
        int lastNameIndex = random.nextInt(65, 91);
        this.name = firstName[random.nextInt(0, 5)] + (char)(lastNameIndex);
        this.course = courses[random.nextInt(0, 3)];
        this.yearStarted = random.nextInt(2018, 2023);
    }

    @Override
    public boolean matchFieldValue(String filedName, String value) {
        String fName = filedName.toUpperCase();
        return switch (fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentID, name, course, yearStarted);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(studentID).compareTo(Integer.valueOf(o.studentID));
    }
}
