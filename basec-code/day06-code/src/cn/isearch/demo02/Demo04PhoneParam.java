package cn.isearch.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "诺基亚";
        phone.price = 100.0;
        phone.color = "黑色";
        method(phone);
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
        param.call("Toby");
        param.sendMessage();
    }
}
