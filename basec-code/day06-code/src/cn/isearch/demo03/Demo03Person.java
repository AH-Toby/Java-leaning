package cn.isearch.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "Toby";
        // person.age = 18; // 如果这边填写-18也是对的，代码不严谨
        person.setAge(20);
        person.show();

    }
}
