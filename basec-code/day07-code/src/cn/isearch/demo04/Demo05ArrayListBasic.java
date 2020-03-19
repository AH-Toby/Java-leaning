package cn.isearch.demo04;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(100);
        listA.add(200);
        int a = listA.get(0);
        int b = listA.get(1);
        System.out.println(a);
        System.out.println(b);

        ArrayList<Character> listB = new ArrayList<>();
        listB.add('a');
        listB.add('c');
        System.out.println(listB.get(0));
        System.out.println(listB.get(1));
    }
}
