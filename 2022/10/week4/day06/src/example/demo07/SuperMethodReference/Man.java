package example.demo07.SuperMethodReference;
/*
    定义子类
 */
public class Man extends Human{
    //子类重写父类sayHello的方法
    @Override
    public void sayHello() {
        System.out.println("Hello 我是Man!");
    }

    //定义一个方法参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
      method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
