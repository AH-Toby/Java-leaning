package cn.isearch.demo03;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] array = new int[3];
        int[] arrayA = {1,2,3,4,5,6,7,8,9,0,8,8,7,6,6,5,65,654,4,5,6,456,65};
        int len = arrayA.length;
        System.out.println("数组的长度为："+len);
        System.out.println("====================");
        int[] arrayB=new  int[5];
        System.out.println(arrayB.length);

        arrayB=new  int[10];
        System.out.println(arrayB.length);
    }
}
