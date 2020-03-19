package cn.isearch.demo05;

import java.util.ArrayList;
import java.util.Random;

// 生成6个1~33之间的随机整数,添加到集合,并遍历
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        // Random ra = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        // 添加集合
        for (int i = 0; i < 6; i++) {
            list.add(new Random().nextInt(33)+1);
        }
        // 遍历集合
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
