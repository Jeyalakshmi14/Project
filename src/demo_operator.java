public class demo_operator {
    public static void main(String[] args)
    {
        methodOne();
        methodTwo(5);
        methodThree(1,2,3);
    }
        public static void  methodOne() {
        System.out.println("method ");
    }
    public static void  methodTwo(int a) {
        System.out.println("method "+a);
    }
    public static void  methodThree(int a,int b,int c) {
        System.out.println("method "+(a+b+c));
    }
}

