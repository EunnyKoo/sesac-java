package _55_jumpToJava;

public class Sample {
    int a; // 객체 변수 a
    void varTest(){
        this.a++;
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 1;
        sample.varTest();
        System.out.println(sample.a);
    }
}
