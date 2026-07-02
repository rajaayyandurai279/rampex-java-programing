package day6.classwork;
import java.util.Scanner;


public class primenumber {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value:");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(" not prime");
            } else if (n % 2 == 0) {
                System.out.println("prime");
            } else if (n == 2) {
                System.out.println("prime");
            } else if (n != 0) {
                System.out.println("not prime");
            } else {
                System.out.println("INVALID VALUES");
            }
        }
    }

