package _01_basic_syntax;

//Primitive Type(기본형)
// - 사용되기 전에 선언되어야 함
// - OS에 따라 자료형 같이 변하지 않음
// - "비객체" 타입 => null값 가질 수 없음

// Reference Type(참조형)
// -java.lang.Object 상속받음
// -기본형이 아니면 모두 참조형
public class DataTypes {
    public static void main(String[] args) {
        char name;
        int student_id$;
        int name2;

        //Primitive Types(기본형)
        System.out.println("---기본형---");
        // 정수형 변수 선언
        int x = 10;
        long y = 10000L;
        short z = 23421;
        byte b = 127;

        // 실수형 변수 선언
        float a = 3.14f;
        double c = 2.72356;
        
        // 문자형 변수 선언
        char ch = 'A';

        // 논리형 변수 선언
        boolean flag = true;

        // 변수 출력
        System.out.println("정수형 변수: "+x+","+y+","+z+","+b);
        System.out.println("실수형 변수: "+a+","+c);
        System.out.println("문자형 변수: "+ch);
        System.out.println("논리형 변수: "+flag);

        // Reference Type(참조형)
        System.out.println("---참조형---");

        // String 참조형 변수 선언과 초기화
        // - Java에서 String 타입은 특별함. 참조형이지만, 기본형처럼 사용함.(불변 객체)
        // - 기본 자료형은 "==" 연산자를 통해 비교하지만, String 객체간 비교는 .equals()란 메소드 사용
        String greeting = "hello world!";
        System.out.println(greeting);
        // 배열(Array) 참조형 변수 선언과 초기화
        int[] nums = {1, 2, 3, 4, 5};
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"");
        }
        System.out.println(" ");
        for(int num : nums){
            System.out.println(num + "");
        }
        Person person = new Person("eun", 29);
        System.out.println("Person 객체: "+ person.getName()+person.getAge());
        // 클래스(Class) 참조형 변수 선언과 초기화
    }
}

// 클래스(추후 배울 예정)
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
}






















