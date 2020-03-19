package cn.isearch.demo05;
// 遍历集合，每个元素使用@符号拼接

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("白胡子");
        list.add("大妈");
        list.add("香克斯");
        list.add("凯多");
        arrayListPrint(list);
    }

    public static void arrayListPrint(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print("}");
            }else {
                System.out.print(list.get(i)+"@");
            }
        }
    }
}
