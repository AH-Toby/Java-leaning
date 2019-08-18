package cn.isearch.demo02;

public class Demo01phone {
    public static void main(String[] args) {
        Phone phone = new Phone();  // 创建手机类
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

        System.out.println("==========================");
        // 修改成员属性
        phone.brand = "华为";
        phone.price = 3999.0;
        phone.color = "蜜语红";
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

        System.out.println("==========================");
        phone.call("Toby");
        phone.sendMessage();
    }
}
