package cn.isearch.demo04;

// 请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
public class Demo04MathTest {
    public static void main(String[] args) {
        double max = 5.9;
        double min = -10.8;
        int count = 0; // 计数器
        // 获取中间值
        for (double i = Math.ceil(-10.8); i <= max; i++){
            if (Math.abs(i) > 6 || Math.abs(i)<2.1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
