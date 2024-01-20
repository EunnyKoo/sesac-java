package _04_exception;

// 예외
// - 일반 예외 (Exception) : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
// - 실행 예외 (Runtime Exception) : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외

// => Java는 예외가 발생하면 예외 클래스로부터 객체 생성하며, 해당 객체는 예외처리시 사용됨
// 예외 발생시 프로그램의 갑작스런 종료를 막고, 정상실행할 수 있도록 처리하는 코드를 예외처리코드라고 함.
// try-catch-finally 블록으로 처리!

// try 블록에서 작성한 코드가 예외 없이 정상 실행 -> catch 실행 X, finally 실행 O
// try 블록에서 작성한 코드에서 예외 발생 -> catch 실행 O, finally 실행 O
// 심지어 try 블록과 catch 블록에서 return문을 사용해도 finally는 항상 실행됨 (finally 생략 가능)

import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
        // << Case 1 >>
        try {
            System.out.println("=====연산시작=====");
            System.out.println(divide(6, 0)); //ArithmeticException: / by zero
        }catch(Exception e) {
            // 예외 발생한 이유만 보여줌
            System.out.println("나누기 중 에러 발생" + e.getMessage()); // by zero

            // 예외 종류 리턴
            System.out.println("나누기 중 에러 발생" + e.toString()); //java.lang.ArithmeticException: / by zero

            // 예외가 어디서 발생했는지 추적한 내용 출력
           // e.printStackTrace(); // at _04_exception.ExceptionEx.divide(ExceptionEx.java:33) at _04_exception.ExceptionEx.main(ExceptionEx.java:19)
        } finally {
            System.out.println("*****연산종료*****");
        }

        // << Case 2 >>
        try {
            System.out.println("=====단어길이시작=====");
            System.out.println(getLength(null));
        }catch(Exception e) {
            System.out.println("단어길이 중 에러 발생" + e.toString()); // java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
        } finally {
            System.out.println("*****단어길이종료*****");
        }

        // << Case 3 >>
        int[] numbers = {10, 20, 30, 40, 50};
        try {
            System.out.println("=====idx시작=====");
            System.out.println(getValueByIdx(numbers, numbers.length));
        }catch(Exception e) {
            System.out.println("idx 에러 발생" + e.toString()); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        } finally {
            System.out.println("*****idx종료*****");
        }

        // << Case 4 >>
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("정수를 입력하세요: ");
            int number = sc.nextInt();
            System.out.println("입력한 정수: " + number);
        }catch (Exception e){
            // 정수 이외의 값이 입력되면 에러 발생
            System.out.println(e.toString()); //java.util.InputMismatchException
        }
    }
    public static String divide(int x, int y){
        return x + " / " + y + " = " + (x/y) ;
    }

    public static int getLength(String str){
        return str.length();
    }

    public static int getValueByIdx(int[] arr, int idx){
        return arr[idx];
    }
}
