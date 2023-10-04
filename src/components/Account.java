package components;

public abstract class Account {
    // Username & Password
    private String username;
    private String password;

    // Constructor
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Get Username 
    public String getUsername() {
        return username;
    }

    // Get Password
    public String getPassword() {
        return password;
    }

    // Set Password
    public void setPassword(String password) {
        this.password = password;
    }

    // Verify Password
    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    // To String
    @Override
    public String toString() {
        return username + " " + getClass().getSimpleName();
    }
    
    
}
