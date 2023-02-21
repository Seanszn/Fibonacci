public class App {
    public static void main(String[] args) throws Exception {
        int h = fib(Integer.parseInt(args[0]));
        System.out.println(h);
    }

    public static int fib(int n){
        if (n<=1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
