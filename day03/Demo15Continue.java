/**
 * Demo15Continue
 */
public class Demo15Continue {
    public static void main(String[] args) {
        // 电梯没有4楼
        for(int i=1; i<=10;i++){
            if(i==4){
                continue;
            }
            System.out.println("这是第"+i+"层");
        }
    }
}