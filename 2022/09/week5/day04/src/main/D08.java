package main;

/**
 * @ClassName D08
 * @Description TODO
 * @Author cc
 * @Date 2022/9/29 8:18
 * @Version 1.0
 */
public class D08 implements Runnable {
    int i = 10;
    Object obj = new Object();
    @Override
    public void run() {
        while ( true ){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.println("异常");
//                throw new RuntimeException(e);
//            }
            synchronized ( obj ){
                if ( i > 0 ){
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(i--);
                }else{
                    break;
                }
            }
        }
    }
}
