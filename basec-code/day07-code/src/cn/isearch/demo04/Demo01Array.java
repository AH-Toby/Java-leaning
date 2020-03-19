package cn.isearch.demo04;
// 定义一个数组，用来存储3个person对象


public class Demo01Array {
    public static void main(String[] args) {
        // 1、创建一个长度为3的数组，里面存放Person类型的数据
        Person[] array = new Person[3];
        Person one = new Person("乔布斯",30);
        Person two = new Person("任正非",50);
        Person three = new Person("马云",30);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());
    }
}
