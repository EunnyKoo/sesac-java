package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("아무거나 작성하세요..👽");

        while (true) {
            String say = sc.next();
            if ("exit".equals(say)) {
                break;
            } else {
                al.add(say);
            }
        }
        System.out.println("내가 작성한 것: " + al);
    }
}