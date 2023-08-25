package chap02.item4;

public class Main {
    //기본 생성자가 private, 상속 불가
//    public class Test1() extends UtilityClass {
//
//    }
    //기본 생성자가 private, 상속 불가(스프링에서 말하는 코드스타일)
//    public class Test2() extends UtilityAbstractClass {
//
//    }

    //기본 생성자가 public이라 상속 가능, 스프링에서 사용하는 코드
    public static class Test3 extends UtilityAbstractPublicClass {
        public Test3() {
        }
        //다른 메서드는 override 불가
        //정적 메서드는 객체 인스턴스가 아닌 클래스에 속하므로 자식 클래스에서 재정의하거나 구현할 수 없다.

    }

    public static void main(String[] args) {
        Test3.doSomeThing();
    }

}
