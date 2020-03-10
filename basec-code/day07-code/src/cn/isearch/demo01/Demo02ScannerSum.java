package cn.isearch.demo01;


import java.util.Scanner;

// 随机输入两个数求和
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("两个数求和结果为：" + c);
    }
}
