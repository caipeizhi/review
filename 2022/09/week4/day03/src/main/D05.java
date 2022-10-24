package main;

import java.util.ArrayList;

/**
 * @ClassName D05
 * @Description TODO
 * @Author cc
 * @Date 2022/9/21 16:26
 * @Version 1.0
 */
public class D05<E>   {
    //定义一个含有泛型的方法
    public void method01(E m){
        System.out.println(m);
    }

    public static void main(String[] args) {
        D05<String> stringD05 = new D05<>();
        stringD05.method01("123");
    }
}
