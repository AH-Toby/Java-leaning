/**
 * Demo05IfElsePractise
 */
public class Demo05IfElsePractise {
    public static void main(String[] args) {
        // ָ�����Գɼ����ж�ѧ���ȼ�
        // 90-100 ����
        // 80-89 ��
        // 70-79 ��
        // 60-69 ����
        // 60���� ������
        int score = 101;
        if (score < 0 || score > 100) {
            System.out.println("����ɼ��Ǵ����");
        } else if (score >= 90 && score <= 100) {
            System.out.println("���ѧ���ĳɼ�Ϊ���㣡");
        } else if (score >= 80 && score < 90) {
            System.out.println("���ѧ���ĳɼ�Ϊ�ã�");
        } else if (score >= 70 && score < 80) {
            System.out.println("���ѧ���ĳɼ�Ϊ����");
        } else if (score >= 60 && score <= 70) {
            System.out.println("���ѧ���ĳɼ�Ϊ����");
        } else{
            System.out.println("���ѧ���ĳɼ�Ϊ������");
        }
    } 
}