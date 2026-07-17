package Day21.classtask;

public class Fibo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
    public static int fibo(int n){

        if (n==0){return 0;}
        else if (n==1){return 1;}
        return fibo(n-1) + fibo( n-2);
    }
}