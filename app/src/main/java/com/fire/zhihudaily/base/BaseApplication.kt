package com.fire.zhihudaily.base

import android.app.Application
import android.content.Context
import android.support.v7.app.AppCompatDelegate
import com.fire.zhihudaily.BuildConfig
import com.fire.zhihudaily.R
import com.fire.zhihudaily.utils.ImageLoader

/**
 * Created by fire on 2017/12/8.
 * Date：2017/12/8
 * Author: fire
 * Description:
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Inner.APP = this
        val preference = getSharedPreferences(getString(R.string.app_name),Context.MODE_PRIVATE)
        if (preference!!.getBoolean("theme",false)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }
        ImageLoader.getInstance(getInstance())
    }

    //Kotlin语言中使用"companion object"修饰静态方法，可以使用类名.方法名的形式调用
    companion object {
        fun getInstance():BaseApplication{
            return Inner.APP!!
        }
    }

//    Kotlin语言中使用"object"修饰静态类，被修饰的类，可以使用类名.方法名的形式调用
    private object Inner {
        var APP: BaseApplication? = null
    }

    object Util {
        fun getCurrentVersion(): String {
            return BuildConfig.VERSION_NAME
        }

    }

}