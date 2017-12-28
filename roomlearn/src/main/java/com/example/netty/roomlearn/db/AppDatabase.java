package com.example.netty.roomlearn.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.netty.roomlearn.model.UserEntity;
import com.example.netty.roomlearn.model.UserEntityDao;

/**
 * 创建数据库抽象类-------- Database : 持有DB和DAO
 * Created by cyh on 2017/12/28.
 * @Database 声明这是一个数据库类，其中 entities里面声明你的数据库里究竟包含了哪几个实体
 * exportSchema 比较有意思，Google 建议是传 true，这样可以把 Scheme 导出到一个文件夹里面
 */
@Database(entities = {UserEntity.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase{


    private static AppDatabase sInstance;

    public static AppDatabase getDatabase(Context context){
        if (sInstance ==null){
            //Room 提供了一个静态的方法，用来在默认的构造方法里创建了一个数据库，
            sInstance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class,"users.db").build();
        }
        return sInstance;
    }


    public static void onDestroy(){
        sInstance = null;
    }

    //把所有 Entity 的 DAO 接口类全部声明成 abstract 的到这里来
    public abstract UserEntityDao getUserEntityDao();


    //Google 会在编译时自动帮我们生成这些抽象类和方法的实现，代码在 app/build/generated/source/apt/debug


}
