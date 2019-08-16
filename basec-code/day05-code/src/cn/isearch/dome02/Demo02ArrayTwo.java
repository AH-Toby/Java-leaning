package cn.isearch.dome02;

public class Demo02ArrayTwo {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==============");
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        int[] ArrayB = new int[3];
        System.out.println(ArrayB);
        System.out.println(ArrayB[0]);
        System.out.println(ArrayB[1]);
        System.out.println(ArrayB[2]);
        System.out.println("==============");
        ArrayB[1] = 100;
        ArrayB[2] = 200;
        System.out.println(ArrayB);  // 内存地址值
        System.out.println(ArrayB[0]);  // 0
        System.out.println(ArrayB[1]);  // 10
        System.out.println(ArrayB[2]);  // 20
    }
}
