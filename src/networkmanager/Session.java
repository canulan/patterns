package networkmanager;

/**
 * Created by ender on 21/01/15.
 */
public class Session {


    private User user;
    private long createTime;

    public Session(User user, long createTime) {
        this.user = user;
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public long getCreateTime() {
        return createTime;
    }


}
