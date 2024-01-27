package _05_class._07_class_total_ex;

public class Airplane extends Vehicle implements Flyable{
    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }
    @Override
    public void fly() {
        System.out.println("고도 " + getMaxSpeed() +"피트에서 비행 중");
    }

    @Override
    public void move() {
        System.out.println("하늘을 날아가는 중");
    }
}
