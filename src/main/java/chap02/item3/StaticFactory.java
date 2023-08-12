package chap02.item3;


public class StaticFactory {
    private static final StaticFactory INSTANCE = new StaticFactory();
    private StaticFactory() { }
    public static StaticFactory getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    private Object readResolve() {
        // 진짜 객체를 반환하고, 가짜 객체는 가비지 컬렉터에 넘긴다.
        return INSTANCE;
    }
}