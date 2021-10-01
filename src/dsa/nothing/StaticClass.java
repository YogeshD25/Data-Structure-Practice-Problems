package dsa.nothing;

public class StaticClass {
    public static void main(String args[]){
        System.out.println("aaaaaaaaaa");
        main(1);
        main(new int[]{1});
        System.out.println("Nothing");
        System.out.println(StaticClass.a);

    }
    static int a = callme();

    public static int callme(){
        System.out.println("5");
        return 5;
    }

    static {
        System.out.println("Block");
    }


    public static void main(int args[]){
        System.out.println("qqqqqqqqqqqq");
    }

    public static void main(int args){
        System.out.println("pppppppp");
    }
}
