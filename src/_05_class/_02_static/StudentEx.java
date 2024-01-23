package _05_class._02_static;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<>();

        while (true) {
            System.out.println("학생 정보를 입력하세요. (이름에 exit 입력시 종료)");
            System.out.println("학생 이름을 입력하세요:");
            String name = scanner.next();
            if (name.equals("exit")) {
                break;
            }
            System.out.println("학생 학번을 입력하세요:");
            int student_id = scanner.nextInt();
            
            System.out.println("학생 학년을 입력하세요:");
            int grade = scanner.nextInt();

            Student student = new Student(name, student_id, grade);
            studentsList.add(student);
        }

        System.out.println("전체 학생 수: " + Student.getTotalStudentsCount());

        StudentEx studentEx = new StudentEx();
        studentEx.displayInfo(studentsList);
    }

    public void displayInfo(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("=====학생 정보=====");
            System.out.println("이름: " + student.getName());
            System.out.println("학번: " + student.getStudent_id());
            System.out.println("학년: " + student.getGrade());
        }
    }
}
