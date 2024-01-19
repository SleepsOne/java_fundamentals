public class LPAStudent extends Student{
    private double percentComplete;

    public LPAStudent(){
        percentComplete = random.nextDouble(0, 100.001);
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    @Override
    public boolean matchFieldValue(String filedName, String value) {
        if (filedName.equalsIgnoreCase("percentComplete")){
            return percentComplete <= Double.parseDouble(value);
        }
        return super.matchFieldValue(filedName, value);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }
}
