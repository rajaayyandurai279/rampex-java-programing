package day10classtask;



    public class objectoriented {

        public static void main(String[] args) {
            Laptop l1=new Laptop();
            l1.browse();
        }
    }

    class Laptop{
        String brand;
        String model;

        public void browse(){
            System.out.println("browsing..");
        }
    }

