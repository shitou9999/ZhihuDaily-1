package com.example.netty.roomlearn.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Entity : 定义POJO类，即数据表结构
 *
 * tableName 如果不写，那么默认类名就是表名
 * 属性使用 @PrimaryKey(autoGenerate = true) 声明这是一个主键。
 * autoGenerate = true 代表自动生成，而且会随着数据增加自增长，可以理解成就是 AUTOINCRESEMENT
 * Room会在编译时检查你的 sql 语句，如果有语法错误，或者表名、字段名错误，都会直接编译报错让你修改，避免运行时出现 crash。
 */
@Entity(tableName = "users")
public class UserEntity {

    @PrimaryKey(autoGenerate = true)
    private int _id;

    private String name;
    private String age;

    public UserEntity(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
