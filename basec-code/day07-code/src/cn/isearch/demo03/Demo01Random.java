package cn.isearch.demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random ra = new Random();
        int a = ra.nextInt();
        System.out.println("生成的随机数是：" + a);
    }
}
