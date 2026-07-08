package day15.classtask;
public class MultiThreading{
    public static void main (String [] args)
    {
        Waiter w1 = new Waiter();
        w1.start();
        try{w1.join();}
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("payment collected");
        }
    }
    class Chef extends Thread{
    public void run(){
        System.out.println("preparing food..wait for 5 seconds");
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
class Waiter extends Thread{
    public void run(){
        Chef c1 = new Chef();
        try{
            c1.join();
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("served...customer eating wait for 10 seconds..");
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
