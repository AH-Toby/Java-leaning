package cn.isearch.demo02;

import java.util.ArrayList;
import java.util.Scanner;

//题目：键盘输入一个字符串，并且统计其中各种字符出现的次数。
//种类有：大写字母、小写字母、数字、其他
public class Demo07StringCount {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
        ArrayList<Character> countUpper = new ArrayList<>();
        ArrayList<Character> countLower = new ArrayList<>();
        ArrayList<Character> countNum = new ArrayList<>();
        ArrayList<Character> countOther = new ArrayList<>();

        // 字符串转字符数组
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if ('A' <= charArray[i] && charArray[i] <= 'Z') {
                countUpper.add(charArray[i]);
            }else if ('a' <= charArray[i] && charArray[i] <= 'z') {
                countLower.add(charArray[i]);
            }else if ('0' <= charArray[i] && charArray[i] <= '9') {
                countNum.add(charArray[i]);
            }else {
                countOther.add(charArray[i]);
            }
        }
        System.out.println("大写字符有："+countUpper.size() +"个");
        System.out.println(countUpper.toString());

        System.out.println("小写字符有："+countLower.size() +"个");
        System.out.println(countLower.toString());

        System.out.println("数字字符有："+countNum.size() +"个");
        System.out.println(countNum.toString());

        System.out.println("其他字符有："+countOther.size() +"个");
        System.out.println(countOther.toString());

    }
}
