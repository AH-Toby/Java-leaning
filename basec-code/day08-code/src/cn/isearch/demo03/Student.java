package cn.isearch.demo03;

public class Student {
    // 私有成员变量
    private int id;  // 学好
    private String name;  // 姓名
    private int age;  // 年龄
    static String room;  // 教室，静态变量
    private static int idCount=0;  // id计数器  每当new了一个新对象时计数器++
    // 无参构造
    public Student(){
        this.id = ++idCount;
    }

    // 全参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
