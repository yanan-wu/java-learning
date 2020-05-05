package cn.kbyd.tree.root.designpattern;

/** 
* @Description: 饿汉式，线程安全
* @return:  
* @Author: yanan.wu
* @Date: 2020/5/5 14:47
*/ 
public class SingletonModle3 {
    private static SingletonModle3 instance = new SingletonModle3();
    private SingletonModle3() {
    }

    public static synchronized SingletonModle3 getInstance() {
        return instance;
    }

}
