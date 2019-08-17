package cn.isearch.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(1,2,3);
        System.out.println("三个数的和为a+b+c="+result[0]);
        System.out.println("三个数的平均数为a+b+c/3="+result[1]);
    }

    public static int[] calculate(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        /*
        // 方法一
        int[] result = new int[2];
        result[0] = sum;
        result[1] = avg;
         */
        // 方法二
        int[] result = {sum,avg};
        return result;
    }
}
