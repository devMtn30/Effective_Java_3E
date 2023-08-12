package chap02.item3;

public class Field {
    public static final Field INSTANCE = new Field();

    private Field() { }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }
}