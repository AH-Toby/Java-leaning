package cn.isearch.demo04;

public class Student {
    String name;
    int age;
    // 无参数构造方法
    public Student(){
    }
    // 全参数构造方法
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    // Setter和Get方法

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
