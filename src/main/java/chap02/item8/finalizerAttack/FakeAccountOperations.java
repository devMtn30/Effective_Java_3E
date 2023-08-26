package chap02.item8.finalizerAttack;

public class FakeAccountOperations extends AccountOperations {

    public FakeAccountOperations() {

    }

    @Override
    protected void finalize() {
        System.out.println("Still I can transfer money");
        this.transferMoney(100);
        System.exit(0);
    }
}
