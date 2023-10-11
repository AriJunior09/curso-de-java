package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program12 {
    public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("José");
    list.add("Alex");
    list.add("Sofia");
    list.add("Emanuel");
    list.add("Monica");

    System.out.println("Quantidade de pessoas: " + list.size());
    for (String x : list){
        System.out.println(x);
    }
    System.out.println("------------------------");
    System.out.println("Removendo a pessoa da posicão 2");
    list.remove(2);
    System.out.println("------------------------");

    System.out.println("Quantidade de pessoas: " + list.size());
    for (String x : list){
        System.out.println(x);
    }
    System.out.println("------------------------");
    System.out.println("Removendo pessoas que começam com 'M'");
    list.removeIf(x -> x.charAt(0) == 'M');
    System.out.println("------------------------");

    System.out.println("Quantidade de pessoas: " + list.size());
    for (String x : list){
        System.out.println(x);
    }
    System.out.println("---------------------");
    System.out.println("Posição do Bob: " + list.indexOf("Bob"));
    System.out.println("Posição do Marco: " + list.indexOf("Marco"));
    System.out.println("---------------------");
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    for (String x : result) {
    System.out.println(x);

    System.out.println("---------------------");
    String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
    System.out.println(name);
    }

    
    }
