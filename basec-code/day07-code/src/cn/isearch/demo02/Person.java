package cn.isearch.demo02;
// java been

public class Person {
    private String name;
    private int age;

    public Person(){
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if(age>=0){
            this.age = age;
        }else {
            System.out.println("数据不合理！");
        }

    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 展示名字的方法
    public void showName(){
        System.out.println("我的名字是：" + this.name);
    }
}
