package cn.isearch.day04.demo03;

/*
题目要求：
定义一个方法，用来判断两个数字是否相同。
 */
/*
三要素：
返回值类型：boolean
方法名称：isSame
参数列表：int a, int b
 */

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(1,2));
    }
    public static boolean isSame(int a, int b){
     /* // 方法一：
        if (a == b){
          return true;
        }else {
            return false;
        }
      */

     /*
        // 方法二：
        boolean same = a == b? true:false;
        return same;
     */

     /*
       // 方法三：
        boolean same = a==b;
        return same;
     */
        //方法四；
        return a==b;
    }
}
