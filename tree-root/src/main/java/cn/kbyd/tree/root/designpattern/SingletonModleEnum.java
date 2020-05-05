package cn.kbyd.tree.root.designpattern;

/** 
* @Description: 枚举
* @return:  
* @Author: yanan.wu
* @Date: 2020/5/5 14:47
*/ 
public enum SingletonModleEnum {

    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
