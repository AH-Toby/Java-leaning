package cn.isearch.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {10,20,40,50,40,100,200};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("最大值为:"+max);
    }
}
