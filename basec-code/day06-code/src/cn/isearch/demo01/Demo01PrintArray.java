package cn.isearch.demo01;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        // 要求打印格式为：[10,20,30,40,50,60]
        // 使用面向过程，每一步骤都要亲力亲为。
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1){
                System.out.println(array[i]+"]");
            } else {
                System.out.print(array[i]+",");
            }
        }
        System.out.println("======================");
        // 使用面向对象
        // 找一个JDK给我们提供好的Array类，
        // 找其中的一个toString方法,直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
