package cn.isearch.day04.demo02;

public class Demo04MethodParma {
    public static void main(String[] args) {
        Method1(10,20);
        Method2();
    }

    // 两个数字相乘，做乘法，必须知道两个数字各自是多少，否则无法进行计算
    // 有参数
    public static void Method1(int a, int b) {
        int result = a * b;
        System.out.println("结果是：" + result);
    }

    // 例如打印输出固定10次文本字符串
    public static void Method2() {
        for (int i = 0; i<10; i++){
            System.out.println("Hello World!"+ i);
        }
    }
}

