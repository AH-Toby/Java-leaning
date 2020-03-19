package cn.isearch.demo01;

public class Demo01String {
    public static void main(String[] args) {
        // 无参构造
        String str1 = new String(); // 小括号留空，说明字符串什么内容都没有。
        System.out.println("第一个字符串是：" + str1);

        // 根据字符数组创建字符串
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是：" + str2);

        // 根据字节数组创建字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是：" + str3);

        // 直接创建
        String str4 = "ABC";
        System.out.println("第四个字符串是：" + str4);
    }

}
