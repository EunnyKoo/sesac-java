package _05_class._04_inheritance;

public class Student extends Person{
    // Case1. 필드가 public인 경우
//    public String campus;
//
//    public Student(String name, int age){
//        // 2-1. 부모 클래스가 기본 생성자
//        //super(); // 생략 되어있음
//
//        // 2-2. 부모 클래스가 매개변수를 갖는 생성자
//        super(name, age);
//    }
//
//    public String getCampus() {
//        return campus;
//    }
//
//    public void setCampus(String campus) {
//        this.campus = campus;
//    }

    // Case2. 필드가 private인 경우
    private String campus;
    public Student(String name, int age){
        super();
        //this.name = name; // private이라 접근이 안됨. 같은 class 내에서만 private은 접근이 가능함
        // 부모로부터 상속받은 필드
        setAge(age);
        setName(name);
    }

    public String getCampus(){
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    // 오버라이딩 - 부모 클래스의 메소드를 자식 클래스에서 재정의
    // 메소드 이름, 매개변수 타입 및 개수, 리턴 타입 등 모든 것 동일하게 
    @Override // 어노테이션(생략 가능)
    public void say(){
        System.out.println(getName()+"hi");
    }
}
