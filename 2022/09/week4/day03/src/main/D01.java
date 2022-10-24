package main;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName D01Variable
 * @Description TODO
 * @Author cc
 * @Date 2022/9/21 12:04
 * @Version 1.0
 */
public class D01 {
    @Test
    public void test1(){
//        当溢出时，从最小的开始加，如-2147483648
        int a = Integer.MAX_VALUE;
        System.out.println(a+1);
    }

    @Test
    public void test2(){
//        使用非默认数据类型为long，float，
        long l = 1L;
        float f = 1.0f;
    }


    @Test
    public void test3(){
//        double类型打印时带上了.0后缀
        double num3 = 30;
        System.out.println(num3); // 30.0
    }

    @Test
    public void test4(){
//        使用包装类能比较好的使用函数
        Integer[] nums = {1,2,3,4};
        List<Integer> ints = Arrays.asList(nums);
        ints.forEach(System.out::println);
    }

    @Test
    public void test5(){
//        boolean不能进行类型转化
//        int b = false;
    }

    @Test
    public void test6(){
//        取模n,值为 -(n-1)~(n-1)
        System.out.println(-4%7);// -4
        System.out.println(4%-7);// 4
    }

    @Test
    public void test7() {
//        三元运算符伴随着强制类型转化
        System.out.println(1 > 2 ? 1.0 : 3);
    }

    @Test
    public void test8() {
//        编译时会有常量优化机制存在
        int result = 5 + 8;
        System.out.println(result);
    }

    @Test
    public void test9() {
//        数组的初始化
        int[] arrayA = new int[] { 5, 15, 25, 40 };
        int[] arrayB = new int[10];
    }

    @Test
    public void test10() {
//        数组的初始化
//        使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
//        如果是整数类型，那么默认为0；
//        如果是浮点类型，那么默认为0.0；
//        如果是字符类型，那么默认为'\u0000'；
//        如果是布尔类型，那么默认为false；
//        如果是引用类型，那么默认为null。
        int[] array1 = new int[10];
        double[] array2 = new double[10];
        char[] array3 = new char[10];
        boolean[] array4 = new boolean[10];
        String[] array5 = new String[10];
        System.out.println(array1[0]);
        System.out.println(array2[0]);
        System.out.println(array3[0]);
        System.out.println(array4[0]);
        System.out.println(array5[0]);
    }

    @Test
    public void test11(){
//        地址的方式System.identityHashCode
        String s1 = "123";
        String s2 = s1;
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }

    @Test
    public void test12(){
//        调整比较器排序
        Integer[] array = { 10, 20, 30, 40, 50 };
        Arrays.sort(array, (o1, o2) -> o2-o1);
        Arrays.stream(array).map(integer -> String.format("%d ", integer)).forEach(System.out::print);
    }
}
