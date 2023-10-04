package components;

import java.util.ArrayList;

public class AdminAccount extends Account {
    // Accounts
    ArrayList<Account> accounts;

    // Constructor
    public AdminAccount(String username, String password, ArrayList<Account> accounts) {
        super(username, password);
        this.accounts = accounts;
    }
}
