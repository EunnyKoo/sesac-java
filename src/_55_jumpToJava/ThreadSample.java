package _06_studyAlone.accessModifier;

import java.util.ArrayList;

// 동작하고 있는 프로그램을 프로세스라고 한다. 보통 한 개의 프로세스는 한 가지의 일을 하지만
// 쓰레드를 이용하면 한 프로세스 내에서 두 가지 또는 그 이상의 일을 동시에 할 수 있다.

// extends Thread 대신 implements Runnable 사용해도 되는 이유:
// Thread클래스를 상속하면 Thread클래스를 상속한 클래스가 다른 클래스를 상속할 수 없기 때문
public class ThreadSample implements Runnable{
    int seq;

    public ThreadSample(int seq){
        this.seq = seq;
    }

    public void run(){ // Thread를 상속하면 run 메소드를 구현해야 한다.
        System.out.println(this.seq + "thread start"); //스레드 시작
        try {
            Thread.sleep(1000); //1초간 대기한다.
        }catch (Exception e){
            
        }
        System.out.println(this.seq + "thread end."); //스레드 종료
    }

    public static void main(String[] args) {
//        ThreadSample sample = new ThreadSample();
//        sample.start(); // start()로 쓰레드를 실행한다.
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i=0; i<10; i++){
            Thread t = new Thread(new ThreadSample(i));
            t.start();
            threads.add(t);
        }
        for (int i=0; i<threads.size(); i++){
            Thread t = threads.get(i);
            try{
                t.join(); //t 스레드가 종료할 때까지 기다린다.
            }catch (Exception e){

            }
        }
        System.out.println("main end."); //main end.
    }
}
