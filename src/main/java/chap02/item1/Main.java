package chap02.item1;

public class Main {
    public static void main(String[] args) {
        Product1 instance = Product1.getDefaultInstance();
        Product1 bookInstance = Product1.getBookInstance();
        Product1 computerInstance = Product1.getComputerInstance();

        System.out.println(instance);
        System.out.println(bookInstance);
        System.out.println(computerInstance);
    }


}
