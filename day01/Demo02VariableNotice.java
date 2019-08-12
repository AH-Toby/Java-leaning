public class Demo02VariableNotice{
    public static void main(String[] args){
        // 定义字节型变量
        byte b = 100;
        System.out.println(b);
        // 定义短整型变量
        short s = 1000;
        System.out.println(s);
        // 定义整型变量
        int i = 1234567;
        System.out.println(i);
        // 定义长整型变量
        long l = 10000L;
        System.out.println(l);
        // 定义单精度浮点型变量
        float f = 3.1415F;
        System.out.println(f);
        // 定义双精度型变量
        double d = 3.1415;
        System.out.println(d);
        // 定义布尔型变量
        boolean bool = true;
        System.out.println(bool);
        // 定义字符型变量
        char c = 'A';
        System.out.println(c);

        // 格式一：// 格式二：
        int num1; // int num1 =10;
        num1 = 10;
        System.out.println(num1);  // System.out.println(num1);
        
        // int num1 = 20; // 又创建了另外一个新的变量，名字也叫num1，错误
        // int num2;  // 定义了一个变量，但是没有赋值
        // System.out.println(num2);  // 直接打印这个是错误的！
        
        // System.out.println(num3);  // 再创建变量之前，不能使用这个变量
        int num3;
        {
            int num4 = 600;
            System.out.println(num4);
        }
        // System.out.println(num4);  // 超出作用域，变量不能再使用了
        // 同时创建了三个全是int类型的变量
        // 格式1：
        int var1, var2, var3;
        var1 = 100;
        var2 = 200;
        var3 = 300;
        // 格式2：
        int car1 = 100,car2 = 200,car3 = 300;
    }
}