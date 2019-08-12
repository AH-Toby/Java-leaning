/**
 * Demo05IfElsePractise
 */
public class Demo05IfElsePractise {
    public static void main(String[] args) {
        // 指定考试成绩，判断学生等级
        // 90-100 优秀
        // 80-89 好
        // 70-79 良
        // 60-69 及格
        // 60以下 不及格
        int score = 101;
        if (score < 0 || score > 100) {
            System.out.println("这个成绩是错误的");
        } else if (score >= 90 && score <= 100) {
            System.out.println("这个学生的成绩为优秀！");
        } else if (score >= 80 && score < 90) {
            System.out.println("这个学生的成绩为好！");
        } else if (score >= 70 && score < 80) {
            System.out.println("这个学生的成绩为良！");
        } else if (score >= 60 && score <= 70) {
            System.out.println("这个学生的成绩为及格！");
        } else{
            System.out.println("这个学生的成绩为不及格！");
        }
    } 
}