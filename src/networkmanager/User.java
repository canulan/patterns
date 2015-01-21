package networkmanager;

/**
 * Created by ender on 21/01/15.
 */
public class User {

    private String mail;
    private String pass;

    public User(String mail, String pass) {
        this.mail = mail;
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
