package _55_jumpToJava;
interface Predator{
    String getFood();

    default void printFood(){
        System.out.printf("my food is %s\n", getFood());
    }

    int LEG_COUNT = 4;

    static int speed(){
        return LEG_COUNT*30;
    }
}

interface Barkable {
    void bark();
}
class Animall{
    String name;
    public void setName(String name) {
        this.name = name;
    }
}
class Tiger extends Animall implements Predator, Barkable{
    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("어흥");
    }
}
class Lion extends Animall implements Predator, Barkable{
    public String getFood(){
        return "banana";
    }
    public void bark(){
        System.out.println("으르렁");
    }
}
// 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것을 '다형성'이라고 한다.
class Bouncer{
    // instanceof는 어떤 객체가 특정 클래스의 객체인지를 조사할 때 사용되는 자바의 내장 명령어
    // animal instanceof Tiger는 'animal 객체는 Tiger 클래스로 만들어진 객체인가?'
    // 를 묻는 조건문이고, 조건이 참이라면 '어흥'을 출력하게 된다.
    void barkAnimal(Barkable animall){
//        if(animall instanceof Tiger){
//            System.out.println("어흥");
//        } else if(animall instanceof Lion){
//            System.out.println("으르렁");
//        }
        animall.bark();
    }
}
class ZooKeepers{
    void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }
}
public class PolymorphismPrac {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
