/**
 * Created by Alex on 17.12.2015.
 */
public class Payment {

    public static void withdraw(Account accountFrom, Account accountTo, double amount) {

        accountFrom.setBalance(accountFrom.getBalance() - amount);
        accountTo.setBalance(accountTo.getBalance() + amount);
    }
}

