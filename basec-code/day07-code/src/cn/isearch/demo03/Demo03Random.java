package cn.isearch.demo03;

import java.util.Random;
import java.util.Scanner;

// 根据int变量n的值，来获取随机数字，范围是[1,n]，可以取到1也可以取到n。
public class Demo03Random {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        int bound = new Scanner(System.in).nextInt();
        System.out.println(bound);
        for (int i = 0; i < 100; i++) {
            int num = new Random().nextInt(bound) + 1;
            System.out.println("生成的随机数是："+num);
        }
    }
}
