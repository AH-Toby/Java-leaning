package cn.isearch.demo03;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // 首先创建对象
        // 然后才能使用没有static关键词的内容
        obj.method();

        // 对于静态方法，可以通过对象名进行调用，也可以直接通过类名称来调用。
        obj.staticMethod();  // 正确，不推荐，这种写法在编译之后也会被javac翻译成为“类名称.静态方法名”
        MyClass.staticMethod();  // 正确推荐

        // 对于本来当中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod(); // 完全等效

    }
    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}
