package com.andy.designpattern.singleton;

/**
 * Created by Andy on 2015/9/29.
 */
public class Singleton {
    //私有的构造函数
    private Singleton() {
    }

    //私有的成员变量
    private static Singleton singleton = new Singleton();
    //公有的静态函数

    public static Singleton getSingleton() {
        return singleton;
    }
}

class Singleton2 {
    //私有的构造函数
    private Singleton2() {
    }

    //私有的成员变量
    private static Singleton2 singleton;
    //公有的静态函数

    public static synchronized Singleton2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}