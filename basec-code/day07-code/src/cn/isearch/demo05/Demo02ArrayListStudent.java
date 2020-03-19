package cn.isearch.demo05;

import java.util.ArrayList;

// 自定义四个学生对象，添加到集合，并遍历
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("白胡子",72);
        Student stu2 = new Student("bigMom",63);
        Student stu3 = new Student("凯多",50);
        Student stu4 = new Student("香克斯",39);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("获取到集合的姓名:"+list.get(i).getName()+"=="+"获取到年龄:"+list.get(i).getAge());
        }
    }
}
