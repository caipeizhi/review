package example.demo04.MethodReference;

public class Demo01Printable {
    //定义一个方法,参数传递Printable接口,对字符串进行打印
    public static void printString(Printable p) {
        p.print("123");
    }

    public static void main(String[] args) {
        printString(System.out::println);
    }
}


