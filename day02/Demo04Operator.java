public class Demo04Operator{
    public static void main(String[] args){
        // ��������֮����Խ�����ѧ����
        System.out.println(20 + 30);
        // ��������֮��Ҳ���Խ�����ѧ����
        int a = 10;
        int b = 20;
        System.out.println(a + b);  //30
        // �����ͳ���֮����Ի���
        System.out.println(a + 20);  //30
        int x = 10;
        int y = 3;
        int result1 = x/y;
        System.out.println(result1); // ȡ�� 3

        int result2 = x%y;
        System.out.println(result2); // ȡģ 1

        // int + double --> double + double -->double
        double result3 = x + 2.5;
        System.out.println(result3); // 12.5

    }
}