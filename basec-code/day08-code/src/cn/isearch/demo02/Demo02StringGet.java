package cn.isearch.demo02;

public class Demo02StringGet {
    public static void main(String[] args) {
        // 获取字符串长度
        int length = "sdajjsfdsgaflgdkagfkahgfkjh".length();
        System.out.println("字符串的长度为：" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "Word";
        String str3 = str1.concat(str2);
        System.out.println("拼接的字符串1为：" + str1);
        System.out.println("拼接的字符串2为：" + str2);
        System.out.println("拼接后的字符串为：" + str3);

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在字符串1号位置的字符为：" + ch);

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果根本没有，返回-1值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次索引值是：" + index); // 2

        System.out.println("HelloWorld".indexOf("abc")); // -1
    }
}
