package _05_class._09_collection._list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        //ArrayList 컬렉션 생성
        List<Book> book = new ArrayList<>();

        //객체 추가
        book.add(new Book("제목1", "지은이1"));
        book.add(new Book("제목2", "지은이2"));
        book.add(new Book("제목3", "지은이3"));
        book.add(new Book("제목4", "지은이4"));
        book.add(new Book("제목5", "지은이5"));
        System.out.println(book);

        // 리스트 개수 얻기
        int size = book.size();
        System.out.println("총 "+size+"권의 책이 존재합니다.");

        // 특정 인덱스 객체 가져오기
        Book thirdBook = book.get(2);
        System.out.println("세 번째 책 정보: " + thirdBook);

        // 인덱스로 특정 객체 삭제
        book.remove(0);
        for(Book b: book){
            System.out.println(b);
        }

        // 모든 객체 삭제
        System.out.println("객체가 비어 있나요?" + book.isEmpty());
        if(book.isEmpty() == false){
            book.clear();
            System.out.println(book);
        }
        System.out.println("객체가 비어 있나요?" + book.isEmpty());
    }
}
