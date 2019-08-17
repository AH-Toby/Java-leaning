package cn.isearch.demo03;

public class Demo05ArrayMin {
    public static void main(String[] args) {
        int[] array = {10,20,40,50,40,100,200,-20};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("最小值为:"+min);
    }
}
