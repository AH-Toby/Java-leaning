/**
 * Demo17MultiplicatioTable
 */
public class Demo17MultiplicatioTable {
    public static void main(String[] args) {
        // 打印99乘法表
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j);  // 不分行打印
                System.out.print("   ");
            }
            System.out.println(); 
        }
    }  
}