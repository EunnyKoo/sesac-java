package _05_class._05_abstract;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        /* shape 객체는 new 연산자로 직접 생성할 수 없지만,
        *  자식 클래스인 Circle, Square에서 new 연산자로 객체 생성 가능
        * Circle circle = new Circle("yellow");
        * Square square = new Square("blue");
        *
        * circle.start();
        * circle.draw();
        * System.out.println(circle.getColor());
        *
        * square.start();
        * square.draw();
        * System.out.println(square.getColor());
        * */

        ArrayList<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle("yellow", "Circle", 8);
        Square square = new Square("blue", "Rectangle", 6, 5);
        shapes.add(circle);
        shapes.add(square);

        for(Shape s: shapes){
            System.out.println("도형의 색상" + s.getColor());
            System.out.println("도형의 넓이" + s.calculateArea());
            System.out.println();
        }
        /*
            도형의 색상yellow
            도형의 넓이200.96

            도형의 색상blue
            도형의 넓이30.0
        * */

    }
}
