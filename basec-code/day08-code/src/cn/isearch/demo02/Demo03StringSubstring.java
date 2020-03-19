package cn.isearch.demo02;

public class Demo03StringSubstring {
    public static void main(String[] args) {
        // 截取字符串
        String str1 = "HelloWord";
        String str2 = str1.substring(5);
        System.out.println("愿字符串为：" + str1); // HelloWord，不会发送改变
        System.out.println("新字符串为：" + str2); // Word

        // 截取中间字符串
        String str3 = str1.substring(4,7);
        System.out.println("新字符串为：" + str3); // oWo

        // 下面这种写法，字符串的内容仍然是没有改变的
        // 下面有两个字符串："Hello"，"Java"
        // strA当中保存的是地址值。
        // 本来地址值是Hello的0x666，
        // 后来地址值变成了Java的0x999
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java
    }
}
