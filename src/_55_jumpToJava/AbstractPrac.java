package _55_jumpToJava;

// 추상 클래스는 인터페이스의 역할도 하면서 클래스의 기능도 가지고 있는 클래스
// 자바 8 버전부터 인터페이스에 default 메서드가 추가도어 추상 클래스와의 차이점이 살짝 모호해짐
// 하지만 추상 클래스는 인터페이스와 달리 일반 클래스처럼 객체 변수, 생성자, private 메서드 등을 가질 수 있다.
abstract class Predatorr extends Animall{
    abstract String getFood();

     void printFood(){
        System.out.printf("my food is %s\n", getFood());
    }
    static int LEG_COUNT = 4; // 추상 클래스의 상수는 static 선언이 필요하다.
    static int speed(){
        return LEG_COUNT * 30;
    }
}
public class AbstractPrac {
}
