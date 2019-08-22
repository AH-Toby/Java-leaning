package cn.isearch.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Toby");
        student.setAge(18);
        student.setMale(true);
        System.out.println("姓名："+student.getName()+"年龄："+student.getAge()+"男的？："+student.isMale());
    }
}
