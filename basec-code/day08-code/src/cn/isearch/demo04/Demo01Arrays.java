package cn.isearch.demo04;


import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        // 将int[]数组按照默认格式变成字符串
        int[] arrayToString = {1,2,3};
        System.out.println(Arrays.toString(arrayToString));

        int[] arraySort = {1,4,2,8,7,6,9};
        Arrays.sort(arraySort);
        System.out.println(Arrays.toString(arraySort));

        String[] arraySortA = {"dddd","cccc","aaaa"};
        Arrays.sort(arraySortA);
        System.out.println(Arrays.toString(arraySortA));
    }
}
