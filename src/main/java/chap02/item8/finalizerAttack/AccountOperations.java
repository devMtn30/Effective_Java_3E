package chap02.item8.finalizerAttack;

public class AccountOperations {

    public AccountOperations() {
        if (!isAuthorized()) {
            throw new SecurityException("You can't access the account");
        }
    }

    public boolean isAuthorized() {
        return false;
    }

    public void transferMoney(double amount) {
        System.out.println("Transferring " + amount + " to beneficiary");
    }
}
