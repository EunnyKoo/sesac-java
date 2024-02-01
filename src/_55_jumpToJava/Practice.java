package _55_jumpToJava;

public class Practice {
    public static void main(String[] args) {
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if(isTall){
            System.out.println("키가 큽니다.");
        }

        int i = 3;
        boolean isOdd = i%2 == 1;
        System.out.println(isOdd); //true

        char a1='a';
        char a2=97;
        char a3='\u0061';
        System.out.println(a1); //a
        System.out.println(a2); //a 아스키코드
        System.out.println(a3); //a 유니코드

        // int, boolean, char 등 원시(primitive) 자료형은 new 키워드로 값을 생성할 수 없다.
        // String은 리터럴 표기 방식을 사용할 수 있지만 원시자료형에 포함되지 않는다.
        // String은 리터럴 표기 방식을 사용할 수 있도록 자바에서 특별 대우해 주는 자료형이다.

        // Wrapper 클래스
        // int, long ... 에는 Wrapper 클래스가 있다. Wrapper 클래스는 원시 자료형을 대신하여 사용할 수 있는 자료형으로, 객체지향프로그래밍의 모든 기능을 활용할 수 있게 해준다.
        // ArrayList 등에는 Wrapper 클래스를 사용해야 한다. 이렇게 하면 값 대신 객체를 주고받을 수 있어 코드를 객체 중심으로 작성하는 데 유리하다.
        // 또한 멀티 스레드 환경에서 동기화를 지원하기 위해서도 Wrapper 클래스는 반드시 필요하다.

        String a = "hello java";
        System.out.println(a.indexOf("j")); //6 j가 시작하는 위치 리턴
        System.out.println(a.charAt(6)); //j 6번째에 위치한 문자 리턴
        System.out.println(a.replaceAll("hello", "hi")); //hi java
        System.out.println(a.substring(0,2)); //he  시작위치<=a<끝위치 출력
        System.out.println(a.toUpperCase()); //HELLO JAVA

        String b = "a:b:c:d";
        String[] result = b.split(":");
        System.out.println(result[0]+result[1]+result[2]+result[3]); //abcd

        // 숫자는 d, 문자는 s
        System.out.println(String.format("I eat %d apples.", 3)); // I eat 3 apples.
        System.out.println(String.format("I eat %s apples.", "three")); //I eat three apples.

        int number = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples, and I got sick for %s days", number, day)); //I ate 10 apples, and I got sick for three days

        System.out.println(String.format("%10s", "hi")); //        hi 출력: 전체 길이가 10인 문자열 공간에서 대입되는 값(hi)을 가장 오른쪽으로 정렬하고 나머지는 공백으로 남겨 두라!
        System.out.println(String.format("%-10sjane.", "hi")); //hi        jane.
        System.out.println(String.format("%.4f", 3.435523123)); //3.4355
    }
}
