public class Demo05Plus{
    public static void main(String[] args){
        // �ַ������͵ı�������ʹ��
        // �������� �������� = ����ֵ��
        String str1 = "Hello";
        System.out.println(str1);  //Hello

        System.out.println("Hello" + "World");  //Hello 

        
		String str2 = "Java";
		// String + int --> String
		System.out.println(str2 + 20); // Java20
		
		// ���ȼ�����
		// String + int + int
		// String		+ int
		// String
		System.out.println(str2 + 20 + 30); // Java2030
		
		System.out.println(str2 + (20 + 30)); // Java50
    }
}