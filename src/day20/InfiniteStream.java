package day20;
import java.util.stream.Stream;
public class InfiniteStream {
    public static void main(String[] args){
        Stream<String>s = Stream.of("rahul","Keerthi","pravin","kishore");
        System.out.println(s.map(n->n.length()).reduce(0,(a,b)->a>b?a:b));
    }
}
