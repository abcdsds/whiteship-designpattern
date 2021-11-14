package adapter;

public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setUsername(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }
}
