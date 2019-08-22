package cn.isearch.demo03;

public class Person {
    String name;
    private int age;  //私有化

    public void show(){
        System.out.println("我的名字叫："+name+"我的年龄："+age);
    }

    public void setAge(int num) {
        if (num>=0){
            age = num;
        }else {
            System.out.println("数据错误");
        }
    }

    public int getAge() {
        return age;
    }
}
