package main;

/**
 * @ClassName D04
 * @Description TODO
 * @Author cc
 * @Date 2022/9/21 13:56
 * @Version 1.0
 */
public class D04 {
//    构造代码快加载先于构造方法
    public D04() {
        System.out.println("构造方法");
    }

    {
        System.out.println("构造代码块");
    }

    public static void main(String[] args) {
        new D04();
    }
}

