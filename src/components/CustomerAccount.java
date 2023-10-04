package components;

public class CustomerAccount extends Account {
    // Profile
    String profile;

    // Constructor
    public CustomerAccount(String username, String password, String profile) {
        super(username, password);
        this.profile = profile;
    }

    // Get Profile
    public String getProfile() {
        return profile;
    }
}
