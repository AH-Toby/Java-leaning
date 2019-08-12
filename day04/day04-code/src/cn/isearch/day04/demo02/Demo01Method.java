package cn.isearch.day04.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }
    // 打印一个5*20矩形
    public static void printMethod(){
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
