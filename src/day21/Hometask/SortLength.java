package day21.Hometask;

import java.util.*;

public class SortLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");

        list.stream()
                .sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);
    }
}