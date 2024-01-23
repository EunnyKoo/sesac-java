package _05_class._03_final;

// final 변수
// - final 키워드가 저장된 변수는 한번 초기화하면 값 변경할 수 없음
public class FinalVariable {
    public static void main(String[] args) {
        // final 변수 선언 및 초기화
        int finalNumber = 10;
        final int finalNo = 5;
        
        // 초기화된 값을 변경하려고 하면 컴파일 오류 발생
        // finalNo = 10; => 오류 발생함!

        // 읽기 전용
        System.out.println(finalNo); // 5로 출력 잘됨!
    }
}
