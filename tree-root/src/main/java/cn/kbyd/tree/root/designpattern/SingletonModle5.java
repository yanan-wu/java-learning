package cn.kbyd.tree.root.designpattern;

/** 
* @Description: 静态内部类
* @return:  
* @Author: yanan.wu
* @Date: 2020/5/5 14:47
*/ 
public class SingletonModle5 {
    private static class SingletonModleHolder {
        private static final SingletonModle5 instance = new SingletonModle5();
    }

    private SingletonModle5() {
    }


    public static final SingletonModle5 getInstance() {
        return SingletonModleHolder.instance;
    }

}
