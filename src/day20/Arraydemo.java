package day20;
import java.util.Arrays;

 class Arraydemo {
    public static void main(String[] args){
        int [] arr ={5,6,7,5,4,1,2,3,8,9,10};
        Arrays.stream(arr).filter((n)->n%2!=0).sorted().forEach(n->System.out.println(n));
    }
}
