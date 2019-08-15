package cn.isearch.dome01;

public class Demo03Array {
    public static void main(String[] args) {
        // 省略格式的静态初始化
        int ArrayA[] = {10,20,30};

        // 静态初始化的标准格式，可以拆分成两个步骤
        // 拆分前
        int ArrayB[] = new int[] {10,20,30};
        // 拆分后
        int ArrayC[];
        ArrayC = new int[]{10,20,30};

        /*
            静态格式的省略模式不能拆分成两个步骤
            int ArrayC[];
            ArrayC ={10,20,30};
         */

        // 动态初始化也可以拆分成两个步骤
        // 拆分前
        int ArrayD[] = new int[4];
        // 拆分后
        int ArrayE[];
        ArrayE = new int[4];

    }
}
