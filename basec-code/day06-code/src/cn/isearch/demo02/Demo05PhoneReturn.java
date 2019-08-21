package cn.isearch.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "一加";
        one.price = 2999.0;
        one.color = "黑曜石";
        return one;
    }
}
