package cn.isearch.demo02;
// 匿名对象
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person per = new Person("Toby",18);
        per.showName();
        System.out.println("++++++++++++++++++++");
        //
        new Person().setName("Td");
        new Person().showName();
    }
}
