/**
 * Demo17MultiplicatioTable
 */
public class Demo17MultiplicatioTable {
    public static void main(String[] args) {
        // ��ӡ99�˷���
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j);  // �����д�ӡ
                System.out.print("   ");
            }
            System.out.println(); 
        }
    }  
}