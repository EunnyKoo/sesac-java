package _05_class._04_inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1 = new Student("Eun", 29);
        Student std2 = new Student("Dan", 30);
//
//        // Case1. 부모, 자식 클래스의 필드가 public인 경우
//        // Person(부모) 클래스로부터 상속받은 필드값 읽기
//        System.out.println(std1.getName());
//        System.out.println(std2.getAge());

        // Person으로부터 상속받은 메소드 호출
//        std1.say();
//        std1.eat("banana");

        // Case2. 부모, 자식 클래스의 필드가 private인 경우
        // Person 으로부터 상속받은 필드 읽기
        System.out.println(std1.getName());
        System.out.println(std2.getAge());
        std1.setCampus("seoul");
        System.out.println(std1.getCampus());
        std1.say();
    }
}
