package _02_control_statement;

// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러 개 정의
// 즉, 이름이 같고 매개변수 타입, 개수, 순서가 다른 경우
// - 동작이 유사할 때 사용하면 편리
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading ml = new MethodOverloading();
        System.out.println(ml.add(1, 3));
        System.out.println(ml.add(4.2, 45.0,234.2));
    }
    public int add(int a, int b) {
        return a+b;
    }
    public double add(double a, double b) {
        return a+b;
    }
    public double add(double a, double c, double b) {
        return a+b+c;
    }
    public int add(int a, int b, int c) {
        return a+b+c;
    }
}
