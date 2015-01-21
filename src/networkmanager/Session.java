package networkmanager;

/**
 * Created by ender on 21/01/15.
 */
public class Session {

    private User user;
    private long createTime;

    public Session(User user) {
        this.user = user;
        this.createTime = System.currentTimeMillis();
    }

    public User getUser() {
        return user;
    }

    public long getCreateTime() {
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
