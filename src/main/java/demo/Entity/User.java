package demo.Entity;

public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String  phoneN;
    private char gender;

    public User() {
    }

    public User(int id, String username, String password, String email, String phoneN, char gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneN = phoneN;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneN() {
        return phoneN;
    }

    public void setPhoneN(String phoneN) {
        this.phoneN = phoneN;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
