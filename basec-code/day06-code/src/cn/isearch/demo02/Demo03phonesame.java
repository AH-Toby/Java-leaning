package cn.isearch.demo02;

public class Demo03phonesame {
    public static void main(String[] args) {
        Phone phoneOne = new Phone();  // 创建手机类
        System.out.println(phoneOne.brand);
        System.out.println(phoneOne.price);
        System.out.println(phoneOne.color);
        System.out.println("==========================");
        // 修改成员属性
        phoneOne.brand = "华为Nova3";
        phoneOne.price = 3999.00;
        phoneOne.color = "黑色";
        System.out.println(phoneOne.brand);
        System.out.println(phoneOne.price);
        System.out.println(phoneOne.color);
        System.out.println("==========================");
        phoneOne.call("Toby");
        phoneOne.sendMessage();

        Phone phoneTwo =  phoneOne;  // 创建手机类
        System.out.println(phoneTwo.brand);
        System.out.println(phoneTwo.price);
        System.out.println(phoneTwo.color);
        System.out.println("==========================");
        // 修改成员属性
        phoneTwo.brand = "苹果SE";
        phoneTwo.price = 4990.0;
        phoneTwo.color = "黑紫色";
        System.out.println(phoneTwo.brand);
        System.out.println(phoneTwo.price);
        System.out.println(phoneTwo.color);
        System.out.println("==========================");
        phoneTwo.call("乔布斯");
        phoneTwo.sendMessage();
    }
}
