package cn.isearch.demo02;

public class Demo04StringConvert {
    public static void main(String[] args) {
        // 转换成为字符数组
        char[] stringArrayCh = "HelloWord".toCharArray();
        System.out.println(stringArrayCh[0]);
        System.out.println(stringArrayCh.length);
        for (int i = 0; i < stringArrayCh.length; i++) {
            System.out.println(stringArrayCh[i]);
        }
        System.out.println("====================");
        // 转换成字节数组
        byte[] stingArrayByte = "HelloWord".getBytes();
        System.out.println(stingArrayByte[0]);
        System.out.println(stingArrayByte.length);
        for (int i = 0; i < stingArrayByte.length; i++) {
            System.out.println(stingArrayByte[i]);
        }
        // 替换
        String str1 = "How do you do!";
        System.out.println("替换前：" + str1);
        String str2 = str1.replace("o", "*");
        System.out.println("替换后：" + str2);

        String lang1 = "会不会玩儿呀！你大爷的！你大爷的！你大爷的！！！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang2); // 会不会玩儿呀！****！****！****！！！
    }
}
