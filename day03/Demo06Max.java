/**
 * Demo06Max
 */
public class Demo06Max {
    public static void main(String[] args) {
     // 判断两个数值的大小
        Max1();
        Max2();
    }
    // 三元运算
    public static void Max1() {
        System.out.println("三元运算方法");
        int a = 100;
        int b = 20;
        int max= a > b ? a : b;
        System.out.println(max);   
    }
    // 判断方法
    public static void Max2() {
        System.out.println("if判断方法");
        int a = 10;
        int b = 20;
        int max;
        if (a >b) {
            max = a;
        }else{
            max = b;
        }
        System.out.println(max);     
    }
}