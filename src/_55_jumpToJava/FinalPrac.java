package _55_jumpToJava;

public class FinalPrac {
    public static void main(String[] args) {
        // 형 변환이란 자료형을 다른 자료형으로 바꾸는 것
        // "123"과 같은 문자열을 123과 같은 숫자로 변경
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n); //123 출력

        int n2 = 123;
        String num2 = n2 + "";
        String num3 = String.valueOf(n2);
        String num4 = Integer.toString(n2);
        System.out.println(num2); //123 출력
        System.out.println(num3); //123 출력
        System.out.println(num4); //123 출력

        // 소수점이 포함되어 있는 숫자 형태의 문자열은 Double.parseDouble
        String num5 = "123.345";
        double d = Double.parseDouble(num5);
        System.out.println(d); //123.345

        // 실수를 정수로 변환하면  실수의 소수점은 제거된다.
        int n3 = (int)d;
        System.out.println(n3); //123(소수점 생략되어 출력)
        // (int)를 해주면서 자료형을 강제로 int형으로 바꾸는 걸 casting이라고 함!

        // 실수 형태의 문자열을 정수로 바꿀 때 NumberFormatException 발생 => Double.parseDouble 먼저 해줄 것!

        // final 자료형 사용하면 그 값을 다시 설정할 수 없다.
        final int f = 123;
       // f = 456; //컴파일 오류 뜸
    }
}
