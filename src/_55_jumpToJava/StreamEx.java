package _06_studyAlone.accessModifier;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

// 스트림은 글자 그대로 해석하면 "흐름"이라는 뜻이다.
// 데이터가 물결처럼 흘러가면서 필터링 과정을 통해 여러 번 변경되어 반환되기 때문에 이런 이름을 가진다.
public class StreamEx {
    public static void main(String[] args) {
//        int[] data = {5,6,7,8,1,2,9,5,6};

//        // 짝수만 포함하는 ArrayList 생성
//        ArrayList<Integer> dataList = new ArrayList<>();
//        for(int i=0; i<data.length; i++){
//            if(data[0] % 2 == 0){
//                dataList.add(data[i]);
//            }
//        }
//        // Set을 사용하여 중복을 제거
//        HashSet<Integer> dataSet = new HashSet<>(dataList);
//
//        // Set을 다시 List로 변경
//        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);
//
//        // 역순으로 정렬
//        distinctList.sort(Comparator.reverseOrder());
//
//        // Integer 리스트를 정수 배열로 변환
//        int[] result = new int[distinctList.size()];
//        for(int i=0; i<distinctList.size();i++){
//            result[i] = distinctList.get(i);
//        }
        int[] data = {5,6,7,8,1,2,9,5,6};
        int[] result = Arrays.stream(data) // IntStream 형성
                .boxed()//IntSream을 Stream<Integer>로 변경한다
                .filter((a) -> a%2 == 0)//짝수만 뽑아낸다.
                .distinct()// 중복을 제거한다.
                .sorted(Comparator.reverseOrder())//역순으로 정렬한다.
                .mapToInt(Integer::intValue) //IntStream으로 다시 변경한다.
                .toArray(); // int[]배열로 반환한다.

        System.out.println(Arrays.toString(result)); //8,6,2 출력
    }
}
