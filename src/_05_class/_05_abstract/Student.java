package _05_class._05_abstract;

public abstract class Student {
    String name;
    String school;
    int age;
    String std_ID;

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public String getStd_ID() {
        return std_ID;
    }

    public Student(String name, String school, int age, String std_ID) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.std_ID = std_ID;
    }

    abstract void todo();
}