package _06_studyAlone.accessModifier;

import java.text.SimpleDateFormat;
import java.util.Date;

class HouseLee{
    // HouseLee 클래스의 lastName은 어떤 객체이든지 동일한 값이 '이'가 출력되도록 해야한다.
    // 이렇게 항상 값이 변하지 않는다면 static을 사용해 메모리 낭비를 줄일 수 있다.
    // 자바는 static 키워드를 붙이면 메모리 할당을 딱 한 번만 하게 되어 메모리를 적게 사용할 수 있다.
    // static을 사용하는 또 다른 이유는 값을 공유할 수 있기 때문이다.
    // static으로 설정하면 같은 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 되는 것이다.
    static String lastName = "이";
}

class Counter{
    // int 앞에 static을 붙이면 count값이 공유되어 count가 증가되어 출력된다.
    // 보통 변수에 쓰는 static 키워드는 프로그래밍을 할 때 메모리의 효율을 높이기 위한 목적보다는 공유의 목적으로 사용된다.
    static int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }

    // static이라는 키워드가 메서드 앞에 붙으면 스태틱 메서드가 된다.
    // 그러면 Counter.getCount()와 같이 객체 생성 없이도 클래스를 통해 메서드를 직접 호출할 수 있다.
    // 스태틱 메서드는 유틸리티성 메서드를 작성할 때 많이 사용된다.
    // 예를 들어 "오늘의 날짜 구하기", "숫자에 콤마 추가하기"
    // 유틸리티성 메서드: 특정 클래스나 인스턴스에 종속되지 앟고, 재사용이 가능하고 범용 기능을 제공하는 스태틱 메서드를 말한다.
    // 이 메서드들은 코드의 중복을 줄이고 가독성을 향상시킨다.
    public static int getCount(){
        return count;
    }
}
    class Util{
        public static String getCurrentDate(String fmt){
            SimpleDateFormat sdf = new SimpleDateFormat(fmt);
            return sdf.format(new Date());
        }
    }

public class Sample {
    public static void main(String[] args) {
        // private < default < protected < public 순으로 보다 많은 접근을 허용한다. 
        // private: 변수나 메서드가 해당 클래스 안에서만 접근 가능 
        // default: 자동으로 설정되어 있어 동일한 패키지 안에서만 접근 가능
        // protected: 동일 패키지의 클래스 또는 해당 클래스를 상속받은 클래스에서 접근 가능 
        // public: 어떤 클래스에서도 접근 가능
        // 접근 제어자를 이용하면 프로그래머의 실수를 방지할 수 있고 기타 위험 요소를 제거할 수 있는 장점이 있다.

        // static: 클래스에서 공유되는 변수나 메서드를 정의할 때 사용
        HouseLee lee1 = new HouseLee();
        HouseLee lee2 = new HouseLee();

        Counter c1 = new Counter(); //1출력
        Counter c2 = new Counter(); //2출력

        System.out.println(Counter.getCount()); //2출력

        System.out.println(Util.getCurrentDate("yyyyMMdd"));//20240423
    }
}
