package chap03.item10.inheritance;

import chap03.item10.Point;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends Point {
    public static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public static int numberCreated() {
        return counter.get();
    }
}
