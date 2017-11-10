package android.zjf.com.greendaotest;

import org.greenrobot.greendao.query.WhereCondition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 破音D弦 on 2017/11/10.
 */

public class UserDAOUtils {
    private ArrayList<User> users;

    /**
     * 增加数据
     */
    public static void insertUser(User user){
        App.getDaoSession().getUserDao().insertOrReplace(user);
    }
    /**
     * 删除数据
     */
    public static void deleteUser(Long id){
        App.getDaoSession().getUserDao().deleteByKey(id);
    }
    public static void deleteUser(User user){
        App.getDaoSession().getUserDao().delete(user);
    }
    /**
     * 更新数据
     */
    public static void updateUser(User user){
        App.getDaoSession().getUserDao().update(user);
    }
    /**
     * 查询全部
     */
    public static List<User> queryAll(){
        return App.getDaoSession().getUserDao().loadAll();
    }
    /**
     * 按条件查询
     */
    public static List<User> queryAd(WhereCondition... whereConditions){
        List<User> users = new ArrayList<>();
        for (WhereCondition w : whereConditions){
            users.addAll(App.getDaoSession().getUserDao().queryBuilder().where(w).list());
        }
        return users;

    }

}
