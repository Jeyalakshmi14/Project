import java.util.Scanner;
public class if_stmnt {
    public static void main(String args[]) {
        int age;
        System.out.println("enter ur age:");
        Scanner in=new Scanner(System.in);
        age= in.nextInt();
        if(age>18)
        {
            System.out.println("ur eligible for vote");
        }
    }
}
