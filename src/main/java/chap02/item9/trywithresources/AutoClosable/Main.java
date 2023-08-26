package chap02.item9.trywithresources.AutoClosable;

public class Main {
    public static void main(String[] args) throws Exception {
        try (AutoCloseableObject autoCloseableObject = new AutoCloseableObject()) {
            System.out.println("autoCloseableObject = " + autoCloseableObject);
        }

        //아래 코드는 에러가 발생한다.
//        try (NormalObject normalObject = new NormalObject()) {
//
//        }

    }
}
