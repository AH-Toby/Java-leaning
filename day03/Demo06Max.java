/**
 * Demo06Max
 */
public class Demo06Max {
    public static void main(String[] args) {
     // �ж�������ֵ�Ĵ�С
        Max1();
        Max2();
    }
    // ��Ԫ����
    public static void Max1() {
        System.out.println("��Ԫ���㷽��");
        int a = 100;
        int b = 20;
        int max= a > b ? a : b;
        System.out.println(max);   
    }
    // �жϷ���
    public static void Max2() {
        System.out.println("if�жϷ���");
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