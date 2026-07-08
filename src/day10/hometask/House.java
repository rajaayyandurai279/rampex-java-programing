package day10.hometask;

public class House {

    String color="skyblue";
    int doors=3;
    int windows=10;
    int bhk=2;
    String owner;

    public void openDoors(){
        System.out.print("door opened");
    }

    public static void main(String[] args){
        House shome=new House();
        House srirajhome=new House();

        shome.owner="satheesh";

        System.out.println(shome.owner);
        srirajhome.owner="sriraj";
        System.out.println(srirajhome.owner);
    }
}