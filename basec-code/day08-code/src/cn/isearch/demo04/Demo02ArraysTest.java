package cn.isearch.demo04;

import java.util.Arrays;

// 请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
public class Demo02ArraysTest {
    public static void main(String[] args) {
        String str = "bsjadbadhbahjsbfkajshvdfahfvkcmkbabkajlb";
        // 字符串变字符集合
        char[] strToCh = str.toCharArray();
        System.out.println(Arrays.toString(strToCh));
        // 升序排列
        Arrays.sort(strToCh);
        System.out.println(Arrays.toString(strToCh));
        // 倒序打印
        for (int i = strToCh.length - 1; i >= 0; i--) {
            System.out.println(strToCh[i]);
        }
    }
}
