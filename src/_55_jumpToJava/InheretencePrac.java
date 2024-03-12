package _55_jumpToJava;

class Animal2 {
    String name;
    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal2{
    // Animal 클래스를 상속한다.
    // Dog는 Animal2의 하위 개념이다. 이런 경우 Dog이 Animal에 포함되기 때문에
    // IS-A 관계라고 표현한다. "Dog is a Animal"과 같이 말할 수 있는 관계!

    // 하지만 이 반대의 경우, 부모 클래스로 만들어진 객체를 자식 클래스의 자료형으로는 사용 불가
    // Dog dog = new Animal() -> 컴파일 에러 발생
    // Animal dog = new Dog() -> Dog is a Animal (O)
    void sleep(){
        System.out.println(this.name+"zzz");
    }
}

// 메서드 오버라이딩 : 부모 클래스의 메서드를 자식 클래스가 동일한 형태로 또다시 구현하는 행위
class HouseDog extends Dog{

    void sleep(){
        System.out.println(this.name+"lalala");
    }
    // 메서드 오버로딩: 이미 sleep이란 메서드가 있지만 동일한 이름의 sleep 메서드 만들기
    // 단, 입력 항목이 달라야 함!!!
    void sleep(int hour){
        System.out.println(this.name+"lalala, "+hour+"hours");
    }
}

// 자바에서 만드는 모든 클래스는 Object 클래스를 상속받는다.
// 따라서 자바에서 만드는 모든 객체는 Object 자료형으로 사용할 수 있다.
public class InheretencePrac {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("puppy");
        System.out.println(dog.name); //puppy
        dog.sleep(); //puppyzzz

        HouseDog houseDog = new HouseDog();
        houseDog.setName("poppy");
        houseDog.sleep(); //poppylalala
        houseDog.sleep(5); //poppylalala, 5hours
        // 자바는 다중 상속을 지원하지 않는다!!!!!!
    }
}
