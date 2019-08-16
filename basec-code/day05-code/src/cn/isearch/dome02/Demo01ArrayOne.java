package cn.isearch.dome02;

public class Demo01ArrayOne {
    public static void main(String[] args) {
        int [] arrayA = new int[3];  // 动态加载
        System.out.println(arrayA);  // 内存地址值
        System.out.println(arrayA[0]);  // 0
        System.out.println(arrayA[1]);  // 0
        System.out.println(arrayA[2]);  // 0

        System.out.println("==============");
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);  // 内存地址值
        System.out.println(arrayA[0]);  // 0
        System.out.println(arrayA[1]);  // 10
        System.out.println(arrayA[2]);  // 20

    }
}
