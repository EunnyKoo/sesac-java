package _05_class._09_collection._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // 키 id, 값은 name인 HashMap 예제

        // Map 컬렉션 생성
        Map<Integer, String> map = new HashMap<>();

        // 객체 저장
        map.put(1001, "홍길동");
        map.put(1002, "성춘향");
        map.put(1003, "구은구");
        map.put(1004, "브레다");
        map.put(1005, "강해린");

        // 전체 객체 수
        int size = map.size();
        System.out.println(size); //5 출력

        // 키로 값을 얻기
        int key = 1003;
        String value = map.get(key);
        System.out.println(value); //구은구 출력

        // 키와 값으로 구성된 모든 Map.Entry 객체를 Set에 담아 리턴
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet); //[1001=홍길동, 1002=성춘향, 1003=구은구, 1004=브레다, 1005=강해린] 출력

        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer, String> entry = iterator.next();
                Integer k = entry.getKey();
                String v = entry.getValue();
                System.out.printf("%s 학생은 %d 번 입니다. %n", v, k);
                /*         <<출력 결과>>
                *   홍길동 학생은 1001 번 입니다.
                    성춘향 학생은 1002 번 입니다.
                    구은구 학생은 1003 번 입니다.
                    브레다 학생은 1004 번 입니다.
                    강해린 학생은 1005 번 입니다.
                * */
        }
        // 키 Set 컬렉션을 얻고, 반복해서 키와 값 얻기
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet); //[1001, 1002, 1003, 1004, 1005]

        // 주어진 키와 일치하는 entry 삭제
        String deletedValue = map.remove(key);
        System.out.printf("%s 학생이 삭제됐습니다. %n", deletedValue); // 구은구 학생이 삭제됐습니다. s
    }
}
