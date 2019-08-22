package cn.isearch.demo03;

public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {10,20,50,100,0,40};
        int max = getMax(array);
        System.out.println("数组中最大的值是："+max);
    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
