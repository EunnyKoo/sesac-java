package _55_jumpToJava;

//1. 객체 개념 배우기
public class Calculator {
    // 계산기는 이전에 계산한 결괏값을 항상 메모리 어딘가에 저장
    int result = 0;
    int add(int num){
        result += num;
        return result;
    }

    int sub(int num){
        result -= num;
        return result;
    }

    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        System.out.println(cal1.add(2));
        System.out.println(cal1.add(5));

        System.out.println(cal2.add(2));
        System.out.println(cal2.add(9));
    }
}
