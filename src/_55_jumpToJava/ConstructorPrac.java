package _55_jumpToJava;

class Animal5 {
    String name;
    void setName(String name){
        this.name = name;
    }
}

class Dog5 extends Animal5{
    Dog5(){
        // 디폴트 생성자
    }
    void sleep(){
        System.out.println(this.name+"zzz");
    }
}


class HouseDog5 extends Dog5{
    // 객체 변수에 값을 무조건 설정해야만 객체가  생성될 수 있도록 강제하는 방법!
    // 생성자 이용하기~~!
    // 생성자 규칙 1. 클래스명과 메서드명 동일   2. 리턴 타입 정의하지 않음(void 사용하지 않음)
    HouseDog5(String name){
        this.setName(name);
    }

    HouseDog5(int type){
        if(type == 1){
            this.setName("yorkshire");
        } else if(type == 2){
            this.setName("bulldog");
        }
    }

    void sleep(){
        System.out.println(this.name+"lalala");
    }
    void sleep(int hour){
        System.out.println(this.name+"lalala, "+hour+"hours");
    }
}

public class ConstructorPrac {
    public static void main(String[] args) {
        HouseDog5 dog = new HouseDog5("kiki");
        HouseDog5 yorkshire = new HouseDog5(1);
        System.out.println(dog.name);
        System.out.println(yorkshire.name); //yorkshire

        // 이렇게 입력 항목이 다른 생성자를 여러 개 만들 수 있는데
        // 이런 것을 생성자 오버로딩(constructor overloading) 이라고 한다.
    }
}
