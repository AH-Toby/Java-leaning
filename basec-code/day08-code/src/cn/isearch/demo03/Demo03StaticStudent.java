package cn.isearch.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student one = new Student("乔布斯",50);
        Student.room="101教室";
        System.out.println("one的名字："+one.getAge()+"，one的年龄："+one.getAge()+"，one的班级：" +  Student.room);

        Student two = new Student("任正非",70);
        System.out.println("two的名字："+two.getAge()+"，two的年龄："+two.getAge()+"，two的班级：" +  Student.room);
    }
}
