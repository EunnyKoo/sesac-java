package _06_studyAlone.accessModifier;

// 람다와 스트림을 사용하지 않아도 코드를 작성할 수 있지만, 사용하는 이유는 코드의 양이 줄어들고 일기 쉬운 코드를 만들 수 있기 때문
// 람다: 익명함수(anonymous function)

import java.util.function.BiFunction;

@FunctionalInterface
interface Calculator{ // BiFunction 인터페이스를 사용하면 Calculator 인터페이스가 필요없다.
    int sum(int a, int b);
    //int mul(int c, int d); // @FuntionalInterface는 두 번째 메소드를 허용하지 않는다.
}
class MyCalculator implements Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}
public class LamdaEx {
    public static void main(String[] args) {
        Calculator mc = new MyCalculator();
        int result = mc.sum(3, 4);
        System.out.println(result); //7 출력

        // 위에 코드를 람다를 적용해서 만들면 아래와 같다.
//        Calculator mc2 = (c, d) -> c+d;
        Calculator mc2 = Integer::sum;
        int result2 = mc2.sum(5,9);
        System.out.println(result2); //7

        // 코드가 더 간결해진 것을 확인할 수 있는데,
        // 주의할 점: Calculator의 인터페이스의 메서드가 1개 이상이면 람다 함수 사용 불가능!
        
        // BiFunction 사용할 경우 calculator 인터페이스 필요 없음
        BiFunction<Integer, Integer, Integer> mc3 = (e, f) -> e+f; // 입력항목 2개, 출력항목 1개
        int result3 = mc3.apply(1,2);
        System.out.println(result3);

    }
}
