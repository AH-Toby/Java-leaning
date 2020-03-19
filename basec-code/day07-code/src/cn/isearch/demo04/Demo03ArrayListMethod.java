package cn.isearch.demo04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 增
        boolean addReturn = list.add("西游记");
        System.out.println("增加的返回值为：" + addReturn);
        list.add("三国演义");
        list.add("水浒传");
        list.add("红楼梦");
        System.out.println(list);

        // 删
        String removeReturn = list.remove(2);
        System.out.println("集合中被删除的内容是：" + removeReturn);
        System.out.println(list);

        // 查
        String getReturn = list.get(0);
        System.out.println(list);
        System.out.println("集合0号位置的值是：" + getReturn);


    }
}
