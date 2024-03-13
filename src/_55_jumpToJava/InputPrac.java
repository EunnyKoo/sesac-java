package _55_jumpToJava;

import java.io.InputStream;
import java.io.IOException;
public class InputPrac {
    public static void main(String[] args) throws IOException {
        // InputStream은 바이트 단위의 데이터를 읽어 들일 때 사용하는 내장 클래스
        // 스트림은 byte의 흐름을 추상화한 개념이며 데이트럴 byte 단위로 다룬다.
        // 스트림
        // 파일 데이터: 파일은 그 시작과 끝이 있는 데이터의 스트림이다.
        // HTTP 송수신 데이터: 브라우저가 요청하고 서버가 응답하는 HTTP 형태의 데이터도 스트림이다.
        // 키보드 입력: 사용자가 키보드로 입력하는 문자, 숫자, 특수문자 등은 스트림이다.
        InputStream in = System.in;

        // 길이가 3byte인 배열을 만든 후 read 메서드의 입력값으로 전달하면 콘솔 입력이 해당 배열에 저장된다.
        byte[] a = new byte[3];
        in.read(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

//        int a;
//        int b;
//        int c;
//
//        a = in.read();
//        b = in.read();
//        c = in.read();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

    }
}
