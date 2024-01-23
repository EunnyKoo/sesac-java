package _05_class._02_static;


public class Student {
    private String name;
    private int student_id;
    private int grade;
    private static int totalStudentsCount = 0;

    public Student(String name, int student_id, int grade) {
        this.name = name;
        this.student_id = student_id;
        this.grade = grade;
        totalStudentsCount++;
    }

    public String getName() {
        return name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getGrade() {
        return grade;
    }

    public static int getTotalStudentsCount() {
        return totalStudentsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
