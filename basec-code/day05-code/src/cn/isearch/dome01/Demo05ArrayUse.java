package cn.isearch.dome01;

public class Demo05ArrayUse {
    public static void main(String[] args) {
        // 静态
        int ArrayA[]={10,20};
        System.out.println(ArrayA[0]);
        System.out.println(ArrayA[1]);
        // 动态
        int ArrayB[]=new int[2];
        System.out.println(ArrayB[0]);
        System.out.println(ArrayB[1]);
        // 浮点
        float ArrayC[]=new float[2];
        System.out.println(ArrayC[0]);
        System.out.println(ArrayC[1]);
        // 字符
        char ArrayD[]=new char[2];
        System.out.println(ArrayD[0]);
        System.out.println(ArrayD[1]);
        // 布尔
        boolean ArrayE[]=new boolean[2];
        System.out.println(ArrayE[0]);
        System.out.println(ArrayE[1]);
        // 引用
        String ArrayF[]=new String[2];
        System.out.println(ArrayF[0]);
        System.out.println(ArrayF[1]);
    }
}
