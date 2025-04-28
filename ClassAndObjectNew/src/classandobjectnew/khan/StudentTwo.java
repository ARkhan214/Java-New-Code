package classandobjectnew.khan;

public class StudentTwo {

    private String name;
    private int roll;
    private String subject;

    private String readInClass;

    public StudentTwo() {
    }

    public StudentTwo(String name, int roll, String subject, String readInClass) {
        this.name = name;
        this.roll = roll;
        this.subject = subject;
        this.readInClass = readInClass;
    }

    public StudentTwo(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

}
