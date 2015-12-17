import java.util.List;

/**
 * Created by Alex on 17.12.2015.
 */
public interface ClientService {
    double getClientBalance(Client client, List<Account> accounts);

    Client getClientWithMaxBalance(List<Account> accounts);

}
