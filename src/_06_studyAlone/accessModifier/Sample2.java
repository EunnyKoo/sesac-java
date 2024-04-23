package _06_studyAlone.accessModifier;

// 디자인 패턴: 소프트웨어 설계에서 반복적으로 나타나는 문제들을 효과적으로 해결하는 데 사용되는 검증된 설계 방법론
// 싱글톤: 단 하나의 객체만을 생성하게 강제하는 디자인 패턴
// 클래스를 통해 생성할 수 있는 객체가 한 개만 되도록 만드는 것
class Singleton{
    private static Singleton one;
    private Singleton(){
    }

    public static Singleton getInstance(){
        if(one == null){
            one = new Singleton();
        }
        return one;
        // return new Singleton(); // 같은 클래스이므로 private 생성자 호출 가능
    }
}

public class Sample2 {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton(); : 컴파일 오류 발생!
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2 == singleton1); //true
    }
}
