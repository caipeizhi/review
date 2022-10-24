package example.demo06.StaticMethodReference;

/*
    通过类名引用静态成员方法
    类已经存在,静态成员方法也已经存在
    就可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {
    //定义一个方法,方法的参数传递要计算绝对值的整数,和函数式接口Calcable
    public static int method(int number,Calcable c){
       return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int number2 = method(-10,Math::abs);
        System.out.println(number2);
    }
}
