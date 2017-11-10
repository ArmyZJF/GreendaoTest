package android.zjf.com.greendaotest;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 破音D弦 on 2017/11/10.
 */
@Entity
public class User {
    @Id(autoincrement = true)
    private Long userId;
    @Unique
    private String name;

    private String userPassword;

    @Generated(hash = 378444503)
    public User(Long userId, String name, String userPassword) {
        this.userId = userId;
        this.name = name;
        this.userPassword = userPassword;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
