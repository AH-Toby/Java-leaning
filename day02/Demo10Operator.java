/**
 * Demo10Operator
 */
public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
		int b = 20;
		
		// �������� �������� = �����ж� ? ���ʽA : ���ʽB;
		// �ж�a > b�Ƿ���������������a��ֵ��ֵ��max�������������b��ֵ��ֵ��max������ѡ��һ
		int max = a > b ? a : b; // ���ֵ�ı���
		System.out.println("���ֵ��" + max); // 20
		
		// int result = 3 > 4 ? 2.5 : 10; // ����д����
		
		System.out.println(a > b ? a : b); // ��ȷд����
		
		// a > b ? a : b; // ����д����
    }
    
}