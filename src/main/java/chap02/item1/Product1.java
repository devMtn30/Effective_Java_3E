package chap02.item1;

public class Product1 {
    private final String name;
    private final int stock;

    private Product1(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public static Product1 getDefaultInstance() {
        return new Product1("default", 0);
    };

    public static Product1 getComputerInstance() {
        return new Product1("computer", 10);
    }

    public static Product1 getBookInstance() {
        return new Product1("Book", 20);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}
