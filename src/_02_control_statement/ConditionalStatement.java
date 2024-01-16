package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 10;
        
        if(number % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }

        //문자열 (String) 객체 비교
        System.out.println("이름을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String name2 = "eun";
        if(name.equals(name2)){
            System.out.println("환영합니다.");
        }else System.out.println("이름을 다시 입력하세요!");

        // why?
        // - '=='연산자: 두 객체의 참조 비교 (동일한 메모리 위치 가르키는지 확인)
        // = '.equals()' 메서드: 두 객체의 "내용"이 동일한지 비교
        
        // "문자열 리터럴"의 경우, Java에서 특별한 취급
        // 동일한 문자열 리터럴이 사용되는 경우, Java 컴파일러는 문자열 풀(string pool)이라는
        // 공유된 메모리 영역에 해당 문자열 저장
        // str1, str2가 같은 문자열을 가리키고 있으므로 같은 참조값을 가짐 
        String str1 = "hello";
        String str2 = "hello";
        if(str1 == str2) {
            System.out.println("같은 참조를 가리킴");
        }else {
            System.out.println("서로 다른 참조를 가리킴");
        }

        // 문자열 "동적 할당"의 경우, new String(...)을 사용해서 새로운 문자열 객체 생성 -> 서로 다른 객체 가르킴
        String str3 = new String("hi");
        String str4 = new String("hi");
        if(str3 == str4) {
            System.out.println("같은 참조를 가리킴");
        }else {
            System.out.println("서로 다른 참조를 가리킴"); //이거 나옴ㅇㅇ
        }

        // switch ~ case문
        // - 각 case문의 break문 선택 사항, break문 생략시 바로 밑의 case문으로 넘어감.
        String dayofWeek = null;
        int day = 4;

        switch (day) {
            case 1:
                dayofWeek = "일요일";
                break;
            case 2:
                dayofWeek = "월요일";
                break;
            case 3:
                dayofWeek = "화요일";
                break;
            case 4:
                dayofWeek = "수요일";
                break;
            case 5:
            case 6:
            case 7:
                dayofWeek = "목요일~일요일";
                break;
        }
        System.out.println(dayofWeek);
    }
}
