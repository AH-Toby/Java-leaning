package cn.isearch.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        // 匿名函数的应用
        int a = new Scanner(System.in).nextInt();
        System.out.println("输入的数字是："+a);

        method(new Scanner(System.in));
        System.out.println("输入的数字是：" + methodOne().nextInt());
    }
    // 匿名函数做参数传递
    public static void method(Scanner sc){
        int a = sc.nextInt();
        System.out.println("输入的数字是："+a);
    }

    // 匿名函数作为返回值
    public static Scanner methodOne(){
        return new Scanner(System.in);
    }
}
