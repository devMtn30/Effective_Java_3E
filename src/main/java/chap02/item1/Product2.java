package chap02.item1;

public class Product2 {
    private final String name;
    private final int stock;
    private static Product2 instance = new Product2("default", 0);

    protected Product2(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public static Book getBookInstance() {
        return new Book("토마토");
    }

    public static Computer getComputerInstance() {
        return new Computer("i9");
    }

    public static Product2 getInstance(String type) {
        switch (type){
            case "computer":
                return getComputerInstance();
            case "book":
                return getBookInstance();
            default:
                return instance;
        }
    };

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}
