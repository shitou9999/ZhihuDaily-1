package com.example.netty.roomlearn;

import android.os.HandlerThread;
import android.os.Looper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cyh on 2017/12/28.
 */

public class BackgroundHandler {

    static HandlerThread sLooperThread;
    static ExecutorService mThreadPool;

    static {
        sLooperThread = new HandlerThread("db-thread");
        sLooperThread.start();
        mThreadPool = Executors.newCachedThreadPool();
    }


    public static void execute(Runnable runnable){
        mThreadPool.execute(runnable);
    }


    public static Looper getLooper(){
        return sLooperThread.getLooper();
    }


    private BackgroundHandler(){

    }


}
