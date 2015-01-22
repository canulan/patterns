package networkmanager;

/**
 * Created by ender on 21/01/15.
 */
public class Session implements ISession {

    private User user;
    private long createTime;

    public Session(User user) {
        this.user = user;
        this.createTime = System.currentTimeMillis();
    }

    @Override
    public User user() {
        return user;
    }

    public String mail() {
        return user.getMail();
    }

    @Override
    public long creationTime() {
        return createTime;
    }

    @Override
    public String toString() {
        return "Session{" +
                "user=" + user +
                ", createTime=" + createTime +
                '}';
    }
}
