package _55_jumpToJava;

public class Sample2 {
    int varTest(int a){
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        Sample2 sample = new Sample2();
        a = sample.varTest(a);
        System.out.println(a); //2
    }
}
