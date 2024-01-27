package _05_class._06_Interface;

public class RemoteControlEx {
    public static void main(String[] args) {
        // interface 도 하나의 타입이므로 변수의 타입으로 사용 가능
        // - interface 는 참조 타입 -> null 대입 가능
        RemoteControl rc;

        // rc 변수에 Television 객체를 대입
        rc = new Television(); // RemoteControl rc = new Television(); 과 동일
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // rc 변수에 Audio 객체를 대입 (교체)
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(13);
        rc.turnOff();

        /*
            TV를 켭니다.
            현재 TV 볼륨: 5
            TV를 끕니다.
            오디오를 켭니다.
            현재 오디오 볼륨: 10
            오디오를 끕니다.
        */
    }
}
