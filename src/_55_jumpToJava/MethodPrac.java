package _55_jumpToJava;

public class MethodPrac {
    // 프로그래밍을 하다 보면 똑같은 내용을 적을 때가 있다. -> 이럴 때 메소드 필요
    int sum(int a, int b){ // a,b는 매개변수
        return a+b;
    }

    public static void main(String[] args) {
        MethodPrac methodPrac = new MethodPrac();
        int c = methodPrac.sum(9,2); // 9,2는 인수
        System.out.println(c); //11

        // 메서드는 입력값을 가지고 어떤 처리를 하여 적절한 리터값을 돌려주는 블랙박스와 같다.
        // 메서드의 내부 동작이 복잡하더라도 외부에서는 그저 입력값을 넣으면 리턴값이 나오는 과정만 관심을 가지기 때문.
    }

}
