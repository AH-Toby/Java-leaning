public class Demo07Operator {
	public static void main(String[] args) {
		int a = 10;
		// ���չ�ʽ���з��룺a = a + 5
		// a = 10 + 5;
		// a = 15;
		// a������10���������¸�ֵ�õ�15
		a += 5; 
		System.out.println(a); // 15
		
		int x = 10;
		// x = x % 3;
		// x = 10 % 3;
		// x = 1;
		// x������10���������¸�ֵ�õ�1
		x %= 3;
		System.out.println(x); // 1
		
		// 50 = 30; // �������ܽ��и�ֵ������д�ڸ�ֵ���������ߡ�����д����
		
		byte num = 30;
		// num = num + 5;
		// num = byte + int
		// num = int + int
		// num = int
		// num = (byte) int
		num += 5;
		System.out.println(num); // 35
	}
}