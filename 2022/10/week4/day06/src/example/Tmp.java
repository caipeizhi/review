package example;

/**
 * @ClassName Tmp
 * @Description TODO
 * @Author cc
 * @Date 2022/9/7 16:29
 * @Version 1.0
 */
public class Tmp {
    public static void t(T t){
        t.print("123");
    }

    public static void main(String[] args) {
        t(Stu::stu);
    }


}
