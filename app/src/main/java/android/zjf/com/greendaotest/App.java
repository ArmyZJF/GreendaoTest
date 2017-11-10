package android.zjf.com.greendaotest;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by 破音D弦 on 2017/11/10.
 */

public class App extends Application {

    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        setupUserDb();
    }

    /**
     *   配置数据库
     */

    private void setupUserDb(){
        //创建user.db
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(this, "user.db", null);
        SQLiteDatabase db = openHelper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取greendao对象管理者
        daoSession = daoMaster.newSession();

    }
    public static DaoSession getDaoSession(){
        return daoSession;
    }
}
