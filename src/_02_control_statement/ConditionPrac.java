package _02_control_statement;

import java.util.Scanner;

public class ConditionPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();
        if (age >= 1 && age <= 7) {
            System.out.println("유아");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = scanner.next();

        switch (name) {
            case "홍길동":
                System.out.println("남자");
                break;
            case "성춘향":
                System.out.println("여자");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }
}
