package cn.isearch.demo05;
// 用一个大集合存入20个随机数字，然后

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        // 生成随机数
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list1.add(new Random().nextInt());
        }
        System.out.println("筛选前的集合为：" + list1);

        ArrayList<Integer> smallList = getSmallList(list1);
        System.out.println("筛选后的集合为：" + smallList);
    }

    // 筛选随机数
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
        }
        return list2;
    }
}
