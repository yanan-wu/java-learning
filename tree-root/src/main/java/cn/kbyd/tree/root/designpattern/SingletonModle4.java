package cn.kbyd.tree.root.designpattern;

/** 
* @Description: 双重校验锁
* @return:  
* @Author: yanan.wu
* @Date: 2020/5/5 14:47
*/ 
public class SingletonModle4 {
    private static volatile SingletonModle4 instance;

    private SingletonModle4() {
    }


    public static  SingletonModle4 getInstance() {
        if (null == instance) {
            synchronized (SingletonModle4.class) {
                if (null == instance) {
                    instance = new SingletonModle4();
                }
            }
        }
        return instance;
    }

}
