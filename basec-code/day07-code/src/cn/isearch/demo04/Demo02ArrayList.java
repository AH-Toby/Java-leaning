package cn.isearch.demo04;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据
        // 备注：从JDK 1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        System.out.println(list);
        list.add("Toby");
        System.out.println(list);
        list.add("HAH");
        System.out.println(list);
    }
}
