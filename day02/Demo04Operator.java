public class Demo04Operator{
    public static void main(String[] args){
        // 两个常量之间可以进行数学运算
        System.out.println(20 + 30);
        // 两个变量之间也可以进行数学运算
        int a = 10;
        int b = 20;
        System.out.println(a + b);  //30
        // 变量和常量之间可以混用
        System.out.println(a + 20);  //30
        int x = 10;
        int y = 3;
        int result1 = x/y;
        System.out.println(result1); // 取整 3

        int result2 = x%y;
        System.out.println(result2); // 取模 1

        // int + double --> double + double -->double
        double result3 = x + 2.5;
        System.out.println(result3); // 12.5

    }
}