package _55_jumpToJava;

interface Predators{
    String getFood();
    
    // 디폴트 메서드 : 오버라이딩 가능
    default void printFood(){
        System.out.printf("my food is %s\n", getFood());
    }

    // 스태틱 메서드
    int LEG_COUNT = 4; //인터페이스 상수

    static int speed(){
        return LEG_COUNT*30;
    }
}
class Animals{
    String name;
    public void setName(String name) {
        this.name = name;
    }
}
class Tigers extends Animals implements Predators{
    public String getFood(){
        return "apple";
    }
}
class Lions extends Animals implements Predators{
    public String getFood(){
        return "banana";
    }
}

// 보통 중요 클래스(ZooKeeper) 클래스의 feed 메서드를 보면
// tiger가 오든지, lion이 오든지 무조건 feed apple이라는 문자열을 출력한다.
// lion이 오면 근데 feed banana를 출력하게 해야함!

class ZooKeeper{
//    void feed(Tigers tigers){
//        System.out.println("feed apple");
//    }
//    void feed(Lions lions){
//        System.out.println("feed banana");
//    }
    void feed(Predators predators){
        System.out.println("feed " + predators.getFood());
    }
}
// ZooKeeper 클래스가 동물 클래스에 의존적인 클래스에서 동물 클래스와 상관없는
// 독립적인 클래스가 되었다는 게 포인트!
public class InterfacePrac {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tigers tigers = new Tigers();
        Lions lions = new Lions();
        zooKeeper.feed(tigers); //feed apple
        zooKeeper.feed(lions); //feed banana

    }
}
