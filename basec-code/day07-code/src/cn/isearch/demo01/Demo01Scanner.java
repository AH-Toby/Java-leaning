package cn.isearch.demo01;

import java.util.Scanner;  // 1、导包

// 功能：获取键盘输入的数字和获取键盘输入的字符串
public class Demo01Scanner {
    public static void main(String[] args) {
        // 2、创建
        Scanner sc = new Scanner(System.in);  // System.in 代表从键盘输入
        // 3、调用方法
        int num = sc.nextInt();
        System.out.println("获取的数字是：" + num);

        String str = sc.next();
        System.out.println("获取的字符串是：" + str);
    }
}
