package cn.isearch.demo03;

public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] Array = {10,20,30};
        System.out.println(Array[0]);
        System.out.println(Array[1]);
        System.out.println(Array[2]);

        //错误写法,因为这个索引是不存在的
        System.out.println(Array[3]);
    }
}
