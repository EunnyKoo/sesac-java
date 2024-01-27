package _05_class._05_abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수", "ABC", 17, "20220001");
        Baek baek = new Baek("백영희", "XYZ", 18, "20220002");

        System.out.println("===" + kim.getName() + " 학생의 정보 ===");
        System.out.println("학교: " + kim.getSchool() + "고등학교");
        System.out.println("나이: " + kim.getAge());
        System.out.println("학번: " + kim.getStd_ID());
        kim.todo();
        System.out.println();

        System.out.println("===" + baek.getName() + " 학생의 정보 ===");
        System.out.println("학교: " + baek.getSchool() + "고등학교");
        System.out.println("나이: " + baek.getAge());
        System.out.println("학번: " + baek.getStd_ID());
        baek.todo();
    }
}
