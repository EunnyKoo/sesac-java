package _03_array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList02 {
    public static void main(String[] args) {
        //1. ArrayList 생성(정수형)
        ArrayList<Integer> numbers = new ArrayList<>();

        //2. 요소 추가
        numbers.add(10);
        numbers.add(50);
        numbers.add(90);

        //3. 요소 접근
        System.out.println(numbers.get(0)); //10
        System.out.println(numbers.get(1)); //50

        //4. 요소 수정
        numbers.set(1, 77);
        System.out.println(numbers); //[10, 77, 90]

        //5. 요소 삽입(지정된 위치)
        numbers.add(1, 80);
        System.out.println(numbers); //[10, 80, 77, 90]

        //6. ArrayList끼리 연결
        System.out.println(Arrays.asList(99, 33, 55)); //[99, 33, 55]
        numbers.addAll(Arrays.asList(99, 33, 55));
        System.out.println(numbers); //[10, 80, 77, 90, 99, 33, 55]

        //7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10)); //0번째
        System.out.println(numbers.indexOf(99)); //4번째

        //8. 요소 삭제
        numbers.remove(0);
        System.out.println(numbers); //[80, 77, 90, 99, 33, 55]

        //9. 리스트 크기 확인
        System.out.println("리스트 크기: " + numbers.size()); //리스트 크기: 6

        //10. 모든 요소 출력
        for(Integer n : numbers){
            System.out.print(n + " "); //80 77 90 99 33 55
        }

        //11. 모든 요소 삭제
        numbers.clear();
        System.out.println("num: "+numbers); //[]

        //student 타입의 ArrayList 생성
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("eun", 20));
        Student std2 = new Student("dan", 30);
        students.add(std2);
        students.add(new Student("sue", 10));
        students.add(new Student("ben", 50));
        students.add(new Student("koo", 40));

        for(Student s : students){
            System.out.print(s.getName() + " ");
        }
        System.out.println(Arrays.toString(students.toArray()));
    }
}

class Student {
    private String name;
    private int age;

    // 생성자 만들어주기
    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}