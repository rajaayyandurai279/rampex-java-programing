package Day11.classtask;


public class ArmstrongNumber {
    public int num = 153;
    public static void main(String [] args){
      ;
        System.out.print(checkArmstrong(153));
    }

    public static boolean checkArmstrong(int num){


        int temp = num;
        int original = num;
        int digit = 0;
        while(temp!=0){
            temp = temp/10; //4 count+=1
            digit++;
        }

        int sum = 0;
        int rem;
        while(num!=0){
            rem = num%10;
            sum = sum+(int)(Math.pow(rem,digit));
            num = num/10;
        }
        System.out.println("The Ams Sum is: " + sum);
        if(original==sum){
            return true;
        }else{
            return false;
        }

    }
}
