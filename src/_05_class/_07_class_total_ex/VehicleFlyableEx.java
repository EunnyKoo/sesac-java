package _05_class._07_class_total_ex;

import java.util.ArrayList;

public class VehicleFlyableEx {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("자동차", 100);
        Airplane airplane = new Airplane("비행기", 10000);
        vehicles.add(car);
        vehicles.add(airplane);

        for(Vehicle v: vehicles){
            v.move();
            if(v instanceof Flyable){
                ((Flyable) v).fly();
            }
        }
    }
}
