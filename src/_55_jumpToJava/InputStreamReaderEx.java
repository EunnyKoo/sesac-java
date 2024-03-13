package _55_jumpToJava;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// 읽어 들인 값을 항상 아스키코드값으로 해석해야 하는 이 방식은 불편하다.
// 입력한 문잣값을 그대로 출력하려면 InputStreamReader를 사용하면 된다.
// BufferedReader는 길이에 상관없이 사용자가 입력한 값을 모두 받아들일 수 있다.
public class InputStreamReaderEx {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader bf = new BufferedReader(reader);

        String a = bf.readLine();

        System.out.println(a);
        
        // InputStream: byte를 읽는다
        // InputStreamReader: character(문자)를 읽는다
        // BufferedReader: String(문자열)을 읽는다
    }
}
