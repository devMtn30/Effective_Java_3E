package chap02.item1;

public class Computer extends Product2{
    private final String cpu;

    protected Computer(String cpu) {
        super("computer", 0);
        this.cpu = cpu;
    }


}
