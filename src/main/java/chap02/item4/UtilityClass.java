package chap02.item4;

// 코드 4-1 인스턴스를 만들 수 없는 유틸리티 클래스
public class UtilityClass {
    //기본 생성자가 만들어지는 것을 막는다.

    private UtilityClass() {
        throw new AssertionError();
    }

    public static void doSomeThing() {
        System.out.println("UtilityClass.doSomeThing");

    }
}

