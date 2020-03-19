package cn.isearch.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("西游记");
        list.add("三国演义");
        list.add("水浒传");
        list.add("红楼梦");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("循环遍历获取集合中的数据为：" + list.get(i));
        }
    }
}
