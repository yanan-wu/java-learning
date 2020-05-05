package cn.kbyd.tree.root.designpattern;

/** 
* @Description: 懒汉式，线程安全
* @return:  
* @Author: yanan.wu
* @Date: 2020/5/5 14:47
*/ 
public class SingletonModle2 {
    private static SingletonModle2 instance;

    private SingletonModle2() {
    }

    public static synchronized SingletonModle2 getInstance() {
        if (null == instance) {
            instance = new SingletonModle2();
        }
        return instance;
    }

}
