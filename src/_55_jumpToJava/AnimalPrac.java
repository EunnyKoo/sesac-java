package _55_jumpToJava;

class Animal {
    String name;

    public void setName(String name){
        this.name = name;
    }
}
public class AnimalPrac {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("CHOCO");
        Animal dog = new Animal();
        dog.setName("HAPPY");
        System.out.println(cat.name); //CHOCO
        System.out.println(dog.name); //HAPPY
        // 클래스에서 가장 중요한 부분은 객체 변수의 값이 위와 같이 독립적으로 유지된다는 점!
        // 객체지향적이라는 말의 의미도 곱씹어 보면 결국 이 객체 변수의 값이 독립적으로 유지되기 때문에 가능한 것!
        // 이름이 같더라도 객체 변수의 값은 공유되지 않는다.
    }
}
