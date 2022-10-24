package main;

import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @ClassName D01
 * @Description TODO
 * @Author cc
 * @Date 2022/9/23 9:46
 * @Version 1.0
 */
public class D07 {
    public static void main(String[] args) {
//        T1<? extends Number> t = new T1();
    }
    //参数泛型
    class T1<E>{
        public void method01(E e){
            System.out.println(e);
        }
    }

    //返回值泛型
    class T2<E>{
        @SneakyThrows
        public E method01(Class<E> aClass){
            E e = aClass.newInstance();
            return e;
        }
    }

    //


    @Test
    public void test1(){
        D08 t = new D08();
        Thread th1 = new Thread(t);
        th1.setName("线程1");
        th1.start();
        Thread th2 = new Thread(t);
        th2.setName("线程2");
        th2.start();
        System.out.println("123");
    }

}
