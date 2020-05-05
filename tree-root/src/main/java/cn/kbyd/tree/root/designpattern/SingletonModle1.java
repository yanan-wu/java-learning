package cn.kbyd.tree.root.designpattern;

/** 
* @Description: 懒汉式，线程不安全 
* @return:  
* @Author: yanan.wu
* @Date: 2020/5/5 14:47
*/ 
public class SingletonModle1 {
    private static SingletonModle1 instance;

    private SingletonModle1() {
    }

    public static SingletonModle1 getInstance() {
        if (null == instance) {
            instance = new SingletonModle1();
        }
        return instance;
    }

}
