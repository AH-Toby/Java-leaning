package cn.isearch.demo02;
/*
定义一个手机类
属性：品牌，价格，颜色
方法，打电话，发短信
 */
public class Phone {
    String brand;
    double price;
    String color;
    public void call(String who){
        System.out.print("给"+ who);
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
