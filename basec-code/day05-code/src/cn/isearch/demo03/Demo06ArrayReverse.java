package cn.isearch.demo03;

public class Demo06ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60};
        // 打印对应元素值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //反转元素
        for (int min = 0,max = (array.length-1); min<max; min++,max--){
            int temp = 0;
            temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        System.out.println("==========================================");
        // 打印反转后对应元素值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
