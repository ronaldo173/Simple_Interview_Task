import java.util.Comparator;
import java.util.List;

/**
 * Created by Alex on 17.12.2015.
 */
public class WorkWithClient implements ClientService {
    public double getClientBalance(Client client, List<Account> accounts) {
        double clientBalanse = 0.0;
        List<Account> clientAccounts;


        for (Account account : accounts) {
            if (account.getClient().equals(client)) {
                clientBalanse += account.getBalance();
            }
        }


        return clientBalanse;
    }

    public Client getClientWithMaxBalance(List<Account> accounts) {

        accounts.sort(new Comparator<Account>() {
            public int compare(Account o1, Account o2) {
                return (int) (o1.getBalance() - o2.getBalance());
            }
        });
//        System.out.println("after sort: ");
//        System.out.println(accounts);

        return accounts.get(accounts.size() - 1).getClient();
    }
}
