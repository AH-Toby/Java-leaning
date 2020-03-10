package cn.isearch.demo01;

import java.util.Scanner;

// 键盘输入三个int值对比三个值，求出最大值
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个值：");
        int a = sc.nextInt();
        System.out.print("请输入第二个值：");
        int b = sc.nextInt();
        System.out.print("请输入第三个值：");
        int c = sc.nextInt();
        int d = a > b ? a : b;
        int e = d > c ? d : c;
        System.out.println("最大值为：" + e);
    }
}
