package _05_class._05_abstract;

// 구체적인 클래스
public class Circle extends Shape {
    private int radius;
    static final double PI = 3.14;

    public Circle(String color, String type, int radius) {
        super(color, type);
        this.radius = radius;
    }

    // 추상 메소드 구현
    void draw(){
        System.out.println("원 그리기!");
    }

    double calculateArea() {
        return radius * radius * PI;
    }
}
