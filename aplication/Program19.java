package aplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program19 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int entrada = sc.nextInt();

        System.out.println("Veja a Lista: " + numeros);
        System.out.println("Multiplicando a Lista por: " + entrada);
        numeros.stream().map(n -> n * entrada).collect(Collectors.toList()).forEach(System.out::println);


        sc.close();
    }
}
