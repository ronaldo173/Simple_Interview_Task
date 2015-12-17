import java.util.List;

/**
 * Created by Alex on 17.12.2015.
 */
public class Account implements ClientService {
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

    public double getClientBalance(Client client, List<Account> accounts) {
        return 0;
    }

    public Client getClientWithMaxBalance(List<Account> accounts) {
        return null;
    }
}
