import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alex on 17.12.2015.
 */
public class TestClientService {

    public static void main(String[] args) {

        Client client1 = new Client("Alex", "Efimov");
        Client client2 = new Client("Bill", "Geits");
        Client client3 = new Client("Vladimir", "Klichko");
        Account account1 = new Account(client1, 100500);
        Account account2 = new Account(client2, 999999);
        Account account3 = new Account(client2, 150);
        Account account4 = new Account(client3, 1000);

        List<Account> accountList = new ArrayList<Account>();
        Collections.addAll(accountList, account1, account2, account3, account4);

        System.out.println(accountList);

        WorkWithClient workWithClient = new WorkWithClient();
        Client clientWithMaxBalance = workWithClient.getClientWithMaxBalance(accountList);
        System.out.println("\n with max balance: " + clientWithMaxBalance + " " + workWithClient.getClientBalance(clientWithMaxBalance, accountList));

    }
}
