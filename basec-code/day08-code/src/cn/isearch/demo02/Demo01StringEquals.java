package cn.isearch.demo02;

public class Demo01StringEquals {
    public static void main(String[] args) {
        // 字符串对比
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //true
        System.out.println(str2.equals(str3)); //true
        System.out.println("Hello".equals(str1)); // true

        // 大小对比
        String str4 = "hello";
        System.out.println(str1.equals(str4)); //false

        // 推荐使用"字符串".equals(str)方法，不推荐str.equals("字符串")方法
        String str5 = null;
        // System.out.println(str5.equals("Hello"));  // 回报空指针错误java.lang.NullPointerException
        System.out.println("Hello".equals(str5)); // 不会报错,false

        // 大小写问题
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));  // false 严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));  // true 忽略大小写

        // 注意，只有英文字母区分大小写，其他都不区分大小写
        System.out.println("abc一123".equalsIgnoreCase("abc壹123")); // false


    }
}
