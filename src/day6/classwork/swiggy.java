package day6.classwork;



import java.util.Scanner;
public class swiggy {


        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the food:");
            String food=sc.nextLine();
            if(food.equals("nonveg")){
                System.out.println("list of nonvegs:");
                System.out.println("butterchicken");
                System.out.println("hyderabadibriyani");
                System.out.println("fishfry");
                System.out.println("chickenchettinad");
            }else if(food.equals("veg")){
                System.out.println("list of vegs:");
                System.out.println("idli");
                System.out.println("dosa");
                System.out.println("paneerbuttermasala");
                System.out.println("vegbiryani");
            }else if(food.equals("dessert")){
                System.out.println("list of Dessert:");
                System.out.println("gulabjamun");
                System.out.println("rasmalai");
                System.out.println("halwa");
                System.out.println("jalebi");
            }else{
                System.out.println("EXIT");
            }
        }
    }

