package com.fire.zhihudaily

import java.util.*

/**
 * Created by PVer on 2017/12/16.
 */
class Study01 {

//    Kotlin 的 == 就相当于 Java 的 equeals，表示比较内容。
//    Kotlin 的 === 就相当于 Java 的 ==，表示比较对象是否相同。

//    三元运算符 int code = isSuccessfully? 200: 400;
//    int code = if(isSuccessfully) 200 else 400

    //1. 如何定义变量 String string = "Hello";
//    var string:String = "我是String变量1"
    var str = "我是String变量2"

    //Java 定义 final 变量的写法：final String string = "Hello";
    val string: String = "我是常量02"
    val stringFinal = "我是常量01"

    //    数值类型的显式转换-- 必须调用 toXXX 方法显示转换 int转long
    var aInt: Int = 10
    var aLong: Long = 10000

// 编译器会报错aLong = aInt
// 必须调用 toXXX 方法显示转换-------->aLong = aInt.toLong()


    /**
     * kotlin定义数组
     * 为了避免装箱和拆箱的开销------------>提供了定制版数组类型，写法为 XArray，例如 Int 的定制版数组为 IntArray
     */
//    String[] names = new String[]{"Kyo", "Ryu", "Iory"};
//    String[] emptyStrings = new String[10];

    var names = arrayOf("01", "02", "03")
    val names2: Array<String> = arrayOf("Kyo", "Ryu", "Iory")

    var emptyStrings = arrayOfNulls<String>(10)
    val emptyStrings2: Array<String?> = arrayOfNulls(10)
//    Array<T> T 即数组元素的类型。另外，String? 表示可以为 null 的 String 类型

    /**
     * kotlin函数写法
     */
    fun testString(name: String): Boolean {
        return true
    }

    /**
     * kotlin写变长参数
     */
//    void hello(String... names){
//
//    }
    fun hello(vararg name: String) {

    }

//    public class Singleton{
//        private static Singleton instance = ...;
//
//        public static Singleton getInstance(){
//            ...
//            return instance;
//        }
//    }
    /**
     * kotlin定义静态变量、方法
     *  JvmStatic 这个注解会将 getInstance 这个方法编译成与 Java 的静态方法一样的签名，
     *  如果不加这个注解，Java 当中无法像调用Java 静态方法那样调用这个方法。
     */
    class KotlinSingleton {
        companion object {
            private val kotlinSingleton = KotlinSingleton()

            @JvmStatic
            fun getInstance() = kotlinSingleton

        }
    }

    /**
     * 实例化类
     */
    val date = Date()

    /**
     *  Getter 和 Setter 方法
     */
    class KotlinGetterAndSetter {
        var x: Int = 0
            set(value) {
                field = value
            }
            get() = field
        //自定义
//        var x: Int = 0
//            set(value) {
//                val date = Calendar.getInstance().apply {
//                    set(2017, 2, 18)
//                }
//                if(System.currentTimeMillis() < date.timeInMillis){
//                    println("Cannot be set before 2017.3.18")
//                }else{
//                    field = value
//                }
//            }
//            get(){
//                println("Get field x: $field")
//                return field
//            }
    }


}