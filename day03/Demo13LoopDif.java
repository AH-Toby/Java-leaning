/**
 * Demo13LoopDif
 */ 
public class Demo13LoopDif {
    public static void main(String[] args) {
        for (int i = 1; i <=0; i++) {
            System.out.println("Hello");
        }   

        System.out.println("=============");
        
        int i = 1;
        do {
            System.out.println("Hello");
            i++;
        }while (i <= 0);
        System.out.println(i);
    }
}