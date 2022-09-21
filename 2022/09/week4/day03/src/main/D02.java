package main;

/**
 * @ClassName D02
 * @Description TODO
 * @Author cc
 * @Date 2022/9/21 12:48
 * @Version 1.0
 */
public class D02 {
//    对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
    private boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
