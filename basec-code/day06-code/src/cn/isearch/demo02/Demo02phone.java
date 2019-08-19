package cn.isearch.demo02;

public class Demo02phone {
    public static void main(String[] args) {

        Phone phoneOne = new Phone();  // 创建手机类
        System.out.println(phoneOne.brand);
        System.out.println(phoneOne.price);
        System.out.println(phoneOne.color);
        System.out.println("==========================");
        // 修改成员属性
        phoneOne.brand = "华为Nova4";
        phoneOne.price = 3990.00;
        phoneOne.color = "蓝色";
        System.out.println(phoneOne.brand);
        System.out.println(phoneOne.price);
        System.out.println(phoneOne.color);
        System.out.println("==========================");
        phoneOne.call("Toby");
        phoneOne.sendMessage();

        Phone phoneTwo = new Phone();  // 创建手机类
        System.out.println(phoneTwo.brand);
        System.out.println(phoneTwo.price);
        System.out.println(phoneTwo.color);
        System.out.println("==========================");
        // 修改成员属性
        phoneTwo.brand = "苹果";
        phoneTwo.price = 4999.0;
        phoneTwo.color = "黑色";
        System.out.println(phoneTwo.brand);
        System.out.println(phoneTwo.price);
        System.out.println(phoneTwo.color);
        System.out.println("==========================");
        phoneTwo.call("乔布斯");
        phoneTwo.sendMessage();
    }
}
