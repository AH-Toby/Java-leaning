package cn.isearch.demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "dan";
        one.sayHello("Toby");
        System.out.println(one);  // 地址值
    }
}
