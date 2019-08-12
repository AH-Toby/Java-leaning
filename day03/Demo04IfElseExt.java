/**
 * Demo04IfElseExt
 */
public class Demo04IfElseExt {
    // x>=3 y = 2x + 1;
    //‐1<=x<3 y = 2x;
    // x<=‐1 y = 2x – 1;
    // 根据给定的x的值，计算出y的值并输出。
    public static void main(String[] args) {
        int x = -10;
        int y;
        if (x > 3) {
            y = 2*x + 1;
        }else if (x > -1 && x < 3) {
            y = 2*x;
        }else{
            y = 2*x -1;
        }
        System.out.println("y的值是：" + y);
    }
}