package com.fire.zhihudaily

import java.util.*

/**
 * Created by PVer on 2017/12/16.
 */
class Study02 {

    fun getName(): String?{
        return null
    }
    /**
     * kotlin空检查
     * 如果你并不确定此函数返回的是否为空，那么你需要在函数后面加上一个?，
     * 如果你确定的知道此函数不会返回空，那么你可以在函数后面加上 !! 表示我明确知道返回值不为空，可放心使用
     *
     * 如果在定义变量时直接赋值，则可以不用指定变量类型，否则需要在变量名后使用“：”来指定类型。
     * 在类型后加“？”表示该变量可空。
     * ？：表示当前是否对象可以为空
     *！！： 表示当前对象不为空的情况下执行
     */
    // 此行代码会报错
//    var nameLength = getName().length

    // 不确定是否为空
//    var nameLength = getName()?.length

    // 确定不为空！！！！！！！！！！
//    var nameLength = getName()!!.length

    // getName 不为空则返回值，为空则不再执行后面的逻辑
//    var nameLength = getName() ?: return

    /**
     * kotlin延迟初始化成员变量
     * Java 定义的类成员变量如果不初始化，那么基本类型被初始化为其默认值，
     * 比如 int 初始化为 0，boolean 初始化为 false，非基本类型的成员则会被初始化为 null。
     */
    //可空类型------------>需要判断其是否为null
    //如果不使用可控类型，需要加 lateinit 关键字

    private val name: String? = null

    private lateinit var inNotNullStrin:String

//    对于 final 的成员变量，Java 要求它们必须在构造方法或者构造块当中对他们进行初始化：
//    private final String name = "Peter";

//    private var name by lazy {
//        NameProvider.getName()
//    }

/*
    var a:Int = null  //错误，类型后没？，即不可空类型，自然不能等于null
    var a:Int? = null  //正确

    val canNull: Int ? = 0
    canNull.toFloat  //错误，
    canNull?.toFloat   //正确，(如果是null，什么都不做)可空变量调用时要判断空
    canNull!!.Float   //正确，(如果null，报空指针)
    val canNotNull: Int  = 0
    canNotNull.toFloat  //正确

    那如果在定义变量时（例如定义成员变量），又想该变量不为空，又不想子定义时就初始化要怎么办呢？使用lateinit关键字

    lateinit var test:String //正确
    lateinit val test：String //错误
    lateinit var test:Float //错误

    关于lateinit关键字的使用限制：

    lateinit modifier is allowed only on mutable properties
    lateinit modifier is not allowed on primitive type properties

    可见，lateinit修饰符只能修饰不可空类型，并且不允许修饰基础类型（四类八种基础类型int， double，boolean等）。

    常用语法：
    switch

    kotlin:

    when (test) {
        1 -> fragment = ShopFragment()
        else -> {

        }
    }

    这只是when最简单的用法，但kotlin里when的用处要比switch强大得多，when可以返回值，甚至可以在匹配条件里检测参数类型等，例如：

    val result = when (x) { //返回值
        0, 1 -> "test"
        else -> "else"
    }

    when(view) { //检测参数类型，并且可见，在kotlin里，instanceof使用is代替
        is TextView -> view.setText("I'm a TextView")
        else -> view.visibility = View.GONE
    }

    var test = 3
    when（view） { //检测参数范围
        in 0..10 -> {
            ...
        }
        else -> {
            ...
        }

        for循环
        for（int i =0; i < 5; i++） {
        }

        kotlin：

        for(i in 0..4) {
        }

        for (item in listData) { //遍历列表，直接操作列表内的对象
            item.method()
        }

        for (i in listData.indices) { //遍历列表带行index
        }

        for（（i， item） in list.witnIndex()） { //加强版
        }

        listData.forEach { it.method() } //变种的for循环

    */


    /**
     * kotlin获得 class 的实例
     */
//    Class<?> clazz = Hello.class;
//
//    Hello hello = new Hello();
//    Class<?> clazz2 = hello.getClass();


//    var clazz: Class<*> = Hello::class.java
//
//    var hello = Hello()
//    var clazz2 = hello.getClass()

//    val clazz = Hello::class.java
//    val hello = Hello()
//    val clazz2 = hello.javaClass

}