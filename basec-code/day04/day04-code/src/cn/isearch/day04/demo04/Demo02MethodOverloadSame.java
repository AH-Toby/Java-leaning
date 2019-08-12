package cn.isearch.day04.demo04;
/*
        题目要求：
        比较两个数据是否相等。
        参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，
        并在main方法中进行测试。*/
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 1;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)a,(short)b));
        System.out.println(isSame((int)a,(int)b));
        System.out.println(isSame((long)a,(long)b));

    }
    // 判断byte类型
    public static boolean isSame(byte a,byte b){
        System.out.println("byte 类型运行了！");
        return a==b;
    }
    // 判断short类型
    public static boolean isSame(short a, short b){
        System.out.println("short 类型运行了！");
        return a==b;
    }
    // 判断int类型
    public static boolean isSame(int a, int b){
        System.out.println("int 类型运行了！");
        return a==b;
    }
    // 判断long类型
    public static boolean isSame(long a, long b){
        System.out.println("long 类型运行了！");
        return a==b;
    }

}
