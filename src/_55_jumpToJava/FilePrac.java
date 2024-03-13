package _55_jumpToJava;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrac {
    public static void main(String[] args) throws IOException {
        //1. 파일 생성하기
//        FileOutputStream output = new FileOutputStream("C:/Users/SBA_USER/Desktop/sesac-java/in.txt");
//        FileWriter fw = new FileWriter("C:/Users/SBA_USER/Desktop/sesac-java/file.txt");
        FileWriter pw = new FileWriter("C:/Users/SBA_USER/Desktop/sesac-java/z2i.txt");
        // 이렇게 하면 out.txt라는 파일이 해당 경로에 생성되어 있다.
        for(int i=1; i<11; i++){
            String data = i+"번째 줄입니다.\r\n";
//            output.write(data.getBytes());
//            fw.write(data);
            pw.write(data);
        }
//        output.close();
//        fw.close();
        pw.close();
        
        // 이미 작성된 파일에 추가하는 방법
        FileWriter fw2 = new FileWriter("C:/Users/SBA_USER/Desktop/sesac-java/z2i.txt", true);
        for(int i=11; i<21; i++){
            String data = i+"번째 줄입니다.\r\n";
//            output.write(data.getBytes());
//            fw.write(data);
            fw2.write(data);
        }
        fw2.close();
    }
}
