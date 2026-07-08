package day9.hometask;

import java.util.Arrays;

    public class reversestring {



        public static void main(String[] args) {
            String s="madam";
            char[] ch=new char[s.length()];
            int n=s.length();

            for (int i = 0; i <s.length(); i++) {
                ch[i]=s.charAt(n-1-i);


            }
            String rev="";
            for (int i = 0; i <ch.length ; i++) {

                rev=rev+ch[i];

            }
            System.out.println(Arrays.toString(ch));

            if(s.equals(rev)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
    }

