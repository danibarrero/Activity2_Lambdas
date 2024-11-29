package org.iesvdm.exercise4;

import java.util.*;
import java.util.stream.Collectors;

public class exercise4 {
    public static void main(String[] args) {
        // Usamos un LinkedHashSet para mantener el orden de inserción de las listas
        Set<List<Integer>> linkedHashSet = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce varias líneas de texto:");

        // Leer cada línea
        while (true) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;  // Detener si la línea está vacía
            }

            // Filtrar y convertir los enteros
            List<Integer> list = Arrays.stream(line.split("\\s+"))
                    .filter(word -> word.matches("\\d+")) // Filtrar solo los números
                    .map(Integer::parseInt) // Convertir los números
                    .collect(Collectors.toList());

            // Solo agregar la lista si no está vacía
            if (!list.isEmpty()) {
                linkedHashSet.add(list);  // Usamos el LinkedHashSet para mantener el orden de inserción
            }
        }

        // Imprimir el contenido del LinkedHashSet
        if (linkedHashSet.isEmpty()) {
            System.out.println("No se han almacenado enteros.");
        } else {
            System.out.println("\nContenido del LinkedHashSet:");
            linkedHashSet.forEach(System.out::println);  // Imprime cada lista en el orden de inserción
        }

        scanner.close();
    }
}
