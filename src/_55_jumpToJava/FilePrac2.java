package _55_jumpToJava;

import java.io.FileInputStream;
import java.io.IOException;

// 파일 읽기
public class FilePrac2 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream inputStream = new FileInputStream("C:/Users/SBA_USER/Desktop/sesac-java/z2i.txt");
        inputStream.read(b);
        System.out.println(new String(b)); //byte 배열 문자열로 변경하여 출력
        inputStream.close();
    }
}
