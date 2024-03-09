package _55_jumpToJava;

import java.util.ArrayList;
import java.util.Arrays;

public class IfPrac {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");
        
        if (pocket.contains("money")){
            System.out.println("택시");
        }else {
            System.out.println("걸어");
        }
        //"택시" 나옴

        // 입력값이 정형화되어 있는 경우 if문보다 switch/case문을 쓰는 게 가독성이 더 좋다.

        // while문은 문장을 반복해서 수행해야 할 경우 사용
        int treeHit = 0;
        while (treeHit < 10){
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if (treeHit == 10){
                System.out.println("나무 넘어갑니다.");
            }
        }

        // 무한 루프: 무한히 반복, while문으로 구현하는데 무한 루프 사용하지 않는 프로그램은 하나도 없다.
        // 무한 루프를 빠져나오기 위한 break
        int coffee = 10;
        int money = 300;
        while (money > 0){
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee +"입니다.");
            if(coffee == 0){
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }
        
        int a = 0;
        while (a<10){
            a++;
            if(a%2==0){
                continue; //짝수인 경우 조건문으로 돌아간다. 
            }
            System.out.println(a); // 홀수만 출력
        }
        
        // for문 
//        int[] marks = {90, 25, 67, 45, 80};
//        for(int i=0; i<=marks.length; i++){
//            if(marks[i] < 60){
//                continue;
//            }
//            System.out.println((i+1)+"번 학생 합격");
//        }

        // 구구단 출력
        for(int i = 2; i<10; i++){
            for (int j=1 ; j<10; j++){
                System.out.println(i*j+" ");
            }
            System.out.println("");
        }

        // for - each
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for(String number : numbers){
            System.out.println(number);
        }
        // for - each문은 따로 반복 횟수를 명시적으로 주는 것이 불가능하고,
        // 한 단계씩 순차적으로 반복할 때만 사용이 가능하다는 제약이 있다.
    }
}
