package cn.isearch.demo03;

import java.util.Random;

// 生成固定范围的随机数
public class Demo02Random {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("生成的随机数是" + new Random().nextInt(9));
        }
    }
}
