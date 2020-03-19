package cn.isearch.demo03;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("乔布斯", 70);
        one.room = "1001";
        System.out.println("名字：" + one.getName()  + "，年龄:" + one.getAge()  + "，班级：" + one.room + "，学号" + one.getId()); // 名字：乔布斯，年龄:70，班级：1001，学号1

        Student two = new Student("任正非", 80);
        System.out.println("名字：" + two.getName()  + "，年龄:" + two.getAge()  + "，班级：" + two.room+"，学号" + two.getId());  // 名字：任正非，年龄:80，班级：1001，学号2

    }
}
