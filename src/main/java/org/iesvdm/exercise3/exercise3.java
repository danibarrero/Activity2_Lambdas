package org.iesvdm.exercise3;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class exercise3 {
    public static void main(String[] args) {
        Set<List<Integer>> hashSet = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        // Leer varias líneas de enteros
        System.out.println("Introduce varios números en diferentes líneas: ");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }

            // Convertir la línea de texto en una lista de enteros
            List<Integer> lista = new ArrayList<>();
            String[] numeros = input.split(" ");
            for (String num : numeros) {
                lista.add(Integer.parseInt(num));
            }

            hashSet.add(lista);
        }

        System.out.println("\nContenido del HashSet:");
        hashSet.forEach(lista -> {
            lista.forEach(num -> System.out.print(num + " "));
            System.out.println();
        });

        scanner.close();
    }
}
