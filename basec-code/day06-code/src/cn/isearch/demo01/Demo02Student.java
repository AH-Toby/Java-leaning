package cn.isearch.demo01;

// 对象和类在统一包内可以不写导包
import cn.isearch.demo01.Student;


public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();  // 创建对象
        System.out.println(stu.name);  // null
        System.out.println(stu.age);  // 0

        System.out.println("=====================");
        // 修改成员变量
        stu.name="Toby";
        stu.age=18;
        System.out.println(stu.name);  // Toby
        System.out.println(stu.age);  // 18

        System.out.println("=====================");
        // 使用成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }
}
