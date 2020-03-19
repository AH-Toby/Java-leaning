package cn.isearch.demo02;

// 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String str = fromArrayToString(arr);
        System.out.println(str);
    }

    public static String fromArrayToString(int[] param) {
        String str = "[";
        for (int i = 0; i < param.length; i++) {
            if(i == param.length-1){
                str += "word" + param[i] + "]";
            }else {
                str += "word" + param[i] + "#";
            }
        }
        return str;
    }
}
