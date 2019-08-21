package cn.isearch.demo03;

public class Demo01VariableDifference {
    String name; // 成员变量
    public void methodA(){
        int num = 20;  // 局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public  void methodB(int param){  // 方法的参数就是局部变量
        //参数在方法调用的时候，必然会被赋值的。
        System.out.println(param);
        int age; // 局部变量
        // System.out.println(age);  // 没有赋值不能使用
//        System.out.println(num);  // 错误写法，出了作用域
        System.out.println(name);
    }
}
