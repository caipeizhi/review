package main;

import org.testng.annotations.Test;

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
//        �����ʱ������С�Ŀ�ʼ�ӣ���-2147483648
        int a = Integer.MAX_VALUE;
        System.out.println(a+1);
    }

    @Test
    public void test2(){
//        ʹ�÷�Ĭ����������Ϊlong��float��
        long l = 1L;
        float f = 1.0f;
    }


    @Test
    public void test3(){
//        double���ʹ�ӡʱ������.0��׺
        double num3 = 30;
        System.out.println(num3); // 30.0
    }

    @Test
    public void test4(){
//        ʹ�ð�װ���ܱȽϺõ�ʹ�ú���
        Integer[] nums = {1,2,3,4};
        List<Integer> ints = Arrays.asList(nums);
        ints.forEach(System.out::println);
    }

    @Test
    public void test5(){
//        boolean���ܽ�������ת��
//        int b = false;
    }

    @Test
    public void test6(){
//        ȡģn,ֵΪ -(n-1)~(n-1)
        System.out.println(-4%7);// -4
        System.out.println(4%-7);// 4
    }

    @Test
    public void test7() {
//        ��Ԫ�����������ǿ������ת��
        System.out.println(1 > 2 ? 1.0 : 3);
    }

    @Test
    public void test8() {
//        ����ʱ���г����Ż����ƴ���
        int result = 5 + 8;
        System.out.println(result);
    }

    @Test
    public void test9() {
//        ����ĳ�ʼ��
        int[] arrayA = new int[] { 5, 15, 25, 40 };
        int[] arrayB = new int[10];
    }

    @Test
    public void test10() {
//        ����ĳ�ʼ��
//        ʹ�ö�̬��ʼ�������ʱ�����е�Ԫ�ؽ����Զ�ӵ��һ��Ĭ��ֵ���������£�
//        ������������ͣ���ôĬ��Ϊ0��
//        ����Ǹ������ͣ���ôĬ��Ϊ0.0��
//        ������ַ����ͣ���ôĬ��Ϊ'\u0000'��
//        ����ǲ������ͣ���ôĬ��Ϊfalse��
//        ������������ͣ���ôĬ��Ϊnull��
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
//        ��ַ�ķ�ʽSystem.identityHashCode
        String s1 = "123";
        String s2 = s1;
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }

    @Test
    public void test12(){
//        �����Ƚ�������
        Integer[] array = { 10, 20, 30, 40, 50 };
        Arrays.sort(array, (o1, o2) -> o2-o1);
        Arrays.stream(array).map(integer -> String.format("%d ", integer)).forEach(System.out::print);
    }
}
