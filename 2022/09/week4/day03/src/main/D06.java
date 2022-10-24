package main;

import lombok.SneakyThrows;

/**
 * @ClassName D06
 * @Description TODO
 * @Author cc
 * @Date 2022/9/21 22:15
 * @Version 1.0
 */
public class D06 {
    public static void main(String[] args) {
        T t;
        Thread th;
        t = new D06().new T();
        for (int i = 0; i < 1000; i++) {
            th = new Thread(t);
            th.setName("线程"+i);
            th.start();
        }
    }
    class T implements Runnable{
        private int ticket = 1000;

        @SneakyThrows
        @Override
        public void run() {
            while ( true ){
                Thread.sleep(20);
                synchronized ( this ){
                    if ( ticket < 0 ){
                        return;
                    }
                    System.out.println(String.format("线程名称%4s 票数%4d", Thread.currentThread().getName(), ticket--));
                }
            }
        }
    }
}


