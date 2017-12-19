package com.fire.zhihudaily.entity;

/**
 * 类的声明学习
 */
public class ClassStudy {
    /*

    类声明由类名、类头（指定其类型参数、主 构造函数等）和由大括号包围的类体构成。类头和类体都是可选的；
    如果一个类没有类体，可以省略花括号

     ***************************************************
    声明没有类体的类（可以省去{ }）
//    class Example
    ***************************************************
    声明有构造函数的类

    在 Kotlin 中定义构造函数的方法与java定义构造函数的方法不同，java是使用类名而Kotlin使用关键字constructor。
    Kotlin一个类可以有一个主构造函数和一个或多个次构造函数。主构造函数是类头的一部分，它跟在类名（和可选的类型参数）后。

    class Example constructor(name : String){ ...... }

    如果主构造函数没有任何注解或者可见性修饰符（private、protected、internal 和 public），可以省略这个 constructor 关键字。

    class Example(name : String){ ...... }

    //此时不可以省略
    class Example public @Inject constructor(name: String) { ...... }
    ***************************************************
    主构造函数的参数可以在 init作为前缀的初始化块中调用，也可以在类中声明变量时初始化时调用。

    class Example constructor(name: String) {

        //初始化成员变量
        var peopleName : String = name

        //主构造函数初始化
        init {
            Log.d("name",name)
        }
    }
     ***************************************************
    可以在主构造函数中直接声明、初始化成员变量，变量要用 var（可变） 或 val（只可初始化一次） 修饰。

    class Example constructor(var name: String, val age: Int) {

        fun method(){
            Log.d("name",name)
            Log.d("age",age.toString())
            name = "小明"
            Log.d("name",name)
        }
    }

    //相当于声明了变量并进行了初始化
    class Example constructor(name: String, age: Int) {

        var name: String = name
        val age: Int = age

        fun method(){
            Log.d("name",name)
            Log.d("age",age.toString())
            name = "小明"
            Log.d("name",name)
        }
    }
     ***************************************************
    次构造函数使用constructor，当有主构造函数事声明次构造函数要使用this绑定。
    通过次构造函数实例化对象时会优先执行初始化块中的方法。

    class Example constructor(name: String) {

        //主构造函数初始化
        init {
            Log.d("name_init", name)
        }

        //先调用初始化块中的方法  在执行此构造函数中的代码
        constructor(name: String, age: Int) : this(name) {
            Log.d("age",age.toString())
        }
    }

    如果没有声明主、次函数，那么该类就会有一个默认的没有参数的主函数，并且他是一个public修饰的。
   ***************************************************
    创建类的实例
    var example = Example()
    var example = Example("小明")
    var example = Example("小明",12)

    类中的内容

1.  构造函数和初始化块
2.  属性
3.  函数
4.  对象声明
5.  嵌套类和内部类

    */

}
