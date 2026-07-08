package day10.hometask;


    public class cartest {


        public static void main(String[] args) {


            Car c1 = new Car();
            System.out.println(c1.brand);
            System.out.print(c1.model);
        }
    }

    class Car {
        String brand = "bmw";
        String model = "m5";
        String color;

        public void drive() {

            System.out.print("Driving");
        }
    }

