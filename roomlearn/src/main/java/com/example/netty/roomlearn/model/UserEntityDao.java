package com.example.netty.roomlearn.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * DAO(Data Access Objects) : 定义访问数据（增删改查）的接口
 *
 * 数据操作接口类
 */
@Dao
public interface UserEntityDao {

    @Query("select * FROM users")
    List<UserEntity> getUserList();

    @Query("select * FROM users WHERE name = :name")
    UserEntity getUserByName(String name);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addUser(UserEntity userEntity);

    @Delete
    void deleteUser(UserEntity userEntity);

}
