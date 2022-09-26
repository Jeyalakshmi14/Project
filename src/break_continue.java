public class break_continue {
    public static void main(String args[]) {
        for (int i = 1; i <= 20; i++) {
            if(i==5)
                continue;
            System.out.println(i);
            if(i==18)
                break;
        }
    }
}
