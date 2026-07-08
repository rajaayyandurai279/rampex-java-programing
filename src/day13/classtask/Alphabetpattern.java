package day13.classtask;

    public class Alphabetpattern {
        public static void main(String[] args) {
            int rows = 6;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");}
                for (int j = 0; j < i; j++) {
                    System.out.print((char)('A' + j) + " ");
                }
                System.out.println();
            }
        }
    }

