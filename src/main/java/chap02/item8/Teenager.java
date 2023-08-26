package chap02.item8;

// cleaner 안전망을 갖춘 자원을 제대로 활용하지 못하는 클라이언트
public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace Out");

        //가비지 컬렉션을 강제로 호출하는 메서드를 사용하고 확인
        //이런 방식에 의존해서 절대안됨
        System.gc();
    }
}
