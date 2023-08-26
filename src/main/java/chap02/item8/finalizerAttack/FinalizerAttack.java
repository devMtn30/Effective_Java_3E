package chap02.item8.finalizerAttack;

import java.util.concurrent.TimeUnit;

public class FinalizerAttack {
    public static void main(String args[]) throws InterruptedException {
        AccountOperations accOperations = null;

        try {
            accOperations = new FakeAccountOperations();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.gc();
        TimeUnit.MINUTES.sleep(10);
    }
}
