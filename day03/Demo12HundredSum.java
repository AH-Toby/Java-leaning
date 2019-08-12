/**
 * Demo12HundredSum
 */
public class Demo12HundredSum {
    // 计算1~100之间所有的偶数和
    public static void main(String[] args) {
        Demo01For();
        Demo02While();
        Demo03DoWhile();
    }
    // for
    public static void Demo01For() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("For1~100之间的偶数和是：" + sum);
    }
    // while
    public static void Demo02While() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("While1~100之间的偶数和是：" + sum);
    }
    // do-while
    public static void Demo03DoWhile() {
        int sum = 0;
        int i = 1;
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }while(i <= 100);
        System.out.println("DoWhile1~100之间的偶数和是：" + sum);
    }
}