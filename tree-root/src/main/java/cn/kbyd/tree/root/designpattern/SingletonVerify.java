package cn.kbyd.tree.root.designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description: 单例模式验证
 * @author: yanan.wu
 * @create: 2020-05-05 15:19
 **/
public class SingletonVerify {

    public static void main(String[] args) {
        verify();

        try {
            reflection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify () {
        SingletonModle1 singletonModle11 = SingletonModle1.getInstance();
        SingletonModle1 singletonModle12 = SingletonModle1.getInstance();
        if (singletonModle11 == singletonModle12) {
            System.out.println("SingletonModle1 verify pass");
        }

        SingletonModle2 singletonModle21 = SingletonModle2.getInstance();
        SingletonModle2 singletonModle22 = SingletonModle2.getInstance();
        if (singletonModle21 == singletonModle22) {
            System.out.println("SingletonModle2 verify pass");
        }

        SingletonModle3 singletonModle31 = SingletonModle3.getInstance();
        SingletonModle3 singletonModle32 = SingletonModle3.getInstance();
        if (singletonModle31 == singletonModle32) {
            System.out.println("SingletonModle3 verify pass");
        }

        SingletonModle4 singletonModle41 = SingletonModle4.getInstance();
        SingletonModle4 singletonModle42 = SingletonModle4.getInstance();
        if (singletonModle41 == singletonModle42) {
            System.out.println("SingletonModle4 verify pass");
        }

        SingletonModle5 singletonModle51 = SingletonModle5.getInstance();
        SingletonModle5 singletonModle52 = SingletonModle5.getInstance();
        if (singletonModle51 == singletonModle52) {
            System.out.println("SingletonModle5 verify pass");
        }

        SingletonModleEnum singletonModleEnum1 = SingletonModleEnum.INSTANCE;
        SingletonModleEnum singletonModleEnum2 = SingletonModleEnum.INSTANCE;
        if (singletonModleEnum1 == singletonModleEnum2) {
            System.out.println("SingletonModleEnum verify pass");
        }
    }

    public static void reflection() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonModle3 singletonModle3 = SingletonModle3.getInstance();

        Constructor constructor = singletonModle3.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);
        SingletonModle3 singletonModle32 = (SingletonModle3) constructor.newInstance();
        if (singletonModle3 == singletonModle32) {
            System.out.println("Two instance are same");
        } else {
            System.out.println("Two instance are not same");
        }

    }
}
