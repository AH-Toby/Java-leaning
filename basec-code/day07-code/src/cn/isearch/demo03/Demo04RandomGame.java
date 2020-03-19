package cn.isearch.demo03;

import java.util.Random;
import java.util.Scanner;

// 用代码模拟猜数字的小游戏。范围在0-100
public class Demo04RandomGame {
    public static void main(String[] args) {
        int num = new Random().nextInt(101);
        while (true){
            System.out.println("请输入你猜测的数：");
            int scanner_num = new Scanner(System.in).nextInt();
            if (scanner_num > num) {
                System.out.println("你猜测的数字太大了");
            }else if(scanner_num<num){
                System.out.println("你猜测的数字太小了");
            }else {
                System.out.println("你猜对了");
                break;
            }

        }
        System.out.println("游戏结束！");
    }
}
