package day6.classwork;

import java.util.Scanner;

public class orderfood {


        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the food:");
            String food=sc.nextLine();
            switch(food){
                case "nonveg":{
                    System.out.println("list of nonvegs:");
                    System.out.println("butterchicken");
                    System.out.println("hyderabadibriyani");
                    System.out.println("fishfry");
                    System.out.println("chickenchettinad");
                    break;}
                case "veg":{
                    System.out.println("list of vegs:");
                    System.out.println("idli");
                    System.out.println("dosa");
                    System.out.println("paneerbuttermasala");
                    System.out.println("vegbiryani");
                    break;}

                case "dessert":{
                    System.out.println("list of Dessert:");
                    System.out.println("gulabjamun");
                    System.out.println("rasmalai");
                    System.out.println("halwa");
                    System.out.println("jalebi");}
                break;
                default:
                    System.out.println("EXIT");
                    break;
            }
        }
    }

