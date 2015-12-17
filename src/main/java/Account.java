import java.util.List;

/**
 * Created by Alex on 17.12.2015.
 */
public class Account {
    private Client client;
    private double balance;

    public Account(Client client, double balance) {
        this.client = client;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "client=" + client +
                ", balance=" + balance +
                '}';
    }
}
