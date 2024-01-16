package _01_basic_syntax;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a,b;

        //대입연산자 ( = )
        x = 10;
        y = 3;
        a = 5.0f;
        b = 10.0f;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println(a-b);

        //증가, 감소 연산자
        System.out.println("===증감연산자===");
        System.out.println(x++);
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(x);
        System.out.println(--x);

        //산술적인 대입 연산자
        System.out.println("=== 산술적인 대입 연산자 ===");
        x = 10;
        System.out.println("x += 5 >>" + (x += 5));
        System.out.println("x -= 5 >>" + (x -= 5));
        System.out.println("x *= 5 >>" + (x *= 5));
        System.out.println("x /= 5 >>" + (x /= 5));
        System.out.println("x %= 5 >>" + (x %= 5));

        // 비교 연산자: 연산 결과 불리언(true/false)
        System.out.println(a>b); //false

        // 논리 연산자: 연산 결과 불리언(true/false)
        boolean j = true;
        boolean k = false;
        boolean l = true;

        System.out.println("===논리연산자===");
        System.out.println("j && k >>" + (j && k)); //And: j.k 모두 참이어야 참
        System.out.println("j && k >>" + (j || k)); //Or: j.k 중 하나만 참이면 참
        System.out.println("!j >> " + (!j)); //not: 부정
        
        // 삼항 연산자
        x=20; y=1;
        System.out.println("===삼항연산자===");
        System.out.println(x > y ? "x는 y보다 큼" : "x가 y보다 작음");

        // 연산자 우선 순위
        // :연산자 우선 순위에 따라서 계산. 명시적으로 지정하고 싶다면, 괄호로 묶어 우선순위 지정 가능

    }
}
