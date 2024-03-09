package _55_jumpToJava;

public class EnumPrac {
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
    public static void main(String[] args) {
        // enum 자료형은 서로 연관 있는 여러 개의 상수 집합을 정의할 때 사용
        System.out.println(CoffeeType.AMERICANO); //AMERICANO 출력
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);
        
        // 반복문으로 한 꺼 번에 출력시키기
        for(CoffeeType type : CoffeeType.values()){
            System.out.println(type);
        }

        // enum 장점
        // 1. 매직 넘버를 사용할 때보다 코드가 명확하다.
        // 2. 잘못된 값을 사용해 생길 수 있는 오류를 막을 수 있다.
    }
}
