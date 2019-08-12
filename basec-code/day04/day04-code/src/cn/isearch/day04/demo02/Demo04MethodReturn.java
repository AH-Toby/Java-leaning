package cn.isearch.day04.demo02;

//题目要求：定义一个方法，用来【求出】两个数字之和。（你帮我算，算完之后把结果告诉我。）
//题目变形：定义一个方法，用来【打印】两个数字之和。（你来计算，算完之后你自己负责显示结果，不用告诉我。）
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int sum = getSum(10,20);
        System.out.println(sum);

        System.out.println("===============================");
        System.out.println(getSum(10,20));

        System.out.println("===============================");
        printSum(10,20);
    }

    // 求出
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    // 打印
    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

}
