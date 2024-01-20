package _04_exception;

import java.util.*;

public class ExceptionPrac {
    public static void main(String[] args) {
        // 실습. 예외처리(1)
        try {
            int[] numbers = {1, 2, 3, 4};
            for (int n=0; n<=numbers.length; n++) {
                System.out.println(numbers[n]);
            }
        } catch (Exception e) {
            System.out.println("실습1예외발생:"+e.toString());
        }

        // 실습. 예외처리(2)
        System.out.println("(실습2)배열 크기 입력: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] user = new int[input];

        try {
            int sum = 0;
            for(int i = 0; i < input; i++){
                System.out.println("정수(" + (i+1) + "):");
                user[i] = sc.nextInt();
                sum += user[i];
            }
            double avg = (double) sum / input;
            System.out.println("평균: " + avg);
        } catch (Exception e) {
            System.out.println("실습2예외발생:" + e.toString());
        }

        // 실습. 예외처리(3)
        System.out.println("(실습3)배열 크기 입력: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        HashSet<Integer> uniqueIntegers = new HashSet<>();
        ArrayList<Integer> duplicateIntegers = new ArrayList<>();
        try{
            System.out.println(size+"개의 정수 입력: ");
            for(int i=0; i<size; i++){
                System.out.println("정수(" + (i+1) + "):");
                int num = sc.nextInt();
                if (uniqueIntegers.contains(num)) {
                    duplicateIntegers.add(num);
                } else {
                    uniqueIntegers.add(num);
                    arr[i] = num;
                }
            }
            if(duplicateIntegers.isEmpty()){
                System.out.println("중복된 요소가 없습니다.");
            }else {
                System.out.println("중복된 정수: " + duplicateIntegers);
            }
        }catch (Exception e){
            System.out.println("실습3예외발생:" + e.getMessage());
        }
    }
}
