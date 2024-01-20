package _05_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return width * height;
    }

    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요.");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        while (width != 0 && height != 0) {
            Rectangle rectangle = new Rectangle(width, height);
            rectangles.add(rectangle);

            System.out.println("가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요.");
            width = scanner.nextInt();
            height = scanner.nextInt();
        }

        for (Rectangle rectangle : rectangles) {
            System.out.println("==================================");
            System.out.println("가로 길이는: " + rectangle.getWidth());
            System.out.println("세로 길이는: " + rectangle.getHeight());
            System.out.println("사각형의 넓이: " + rectangle.area());
        }

        scanner.close();
    }
}
