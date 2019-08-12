/**
 * Demo10Operator
 */
public class Demo10Operator {
    public static void main(String[] args) {
        int a = 10;
		int b = 20;
		
		// 数据类型 变量名称 = 条件判断 ? 表达式A : 表达式B;
		// 判断a > b是否成立，如果成立将a的值赋值给max；如果不成立将b的值赋值给max。二者选其一
		int max = a > b ? a : b; // 最大值的变量
		System.out.println("最大值：" + max); // 20
		
		// int result = 3 > 4 ? 2.5 : 10; // 错误写法！
		
		System.out.println(a > b ? a : b); // 正确写法！
		
		// a > b ? a : b; // 错误写法！
    }
    
}