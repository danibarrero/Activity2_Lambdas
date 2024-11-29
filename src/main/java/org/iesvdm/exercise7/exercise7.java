package org.iesvdm.exercise7;

import java.util.*;

public class exercise7 {
    public static void main(String[] args) {
        HashSet<List<Integer>> conjuntoDeListas = new HashSet<>(List.of(
                List.of(1, 2, 3, 4, 12),
                List.of(5, 6, 7, 1, 1, 2),
                List.of(8, 9, 10, 11)
        ));

        Comparator<List<Integer>> porLongitud = Comparator.comparingInt(List::size);

        Comparator<List<Integer>> porSuma = Comparator.comparingInt(lista -> lista.stream()
                .mapToInt(Integer::intValue)
                .sum());

        List<Integer> listaMasLarga = Collections.max(conjuntoDeListas, porLongitud);
        System.out.println("Lista más larga: " + listaMasLarga);

        List<Integer> listaConMayorSuma = Collections.max(conjuntoDeListas, porSuma);
        System.out.println("Lista con mayor suma: " + listaConMayorSuma);

        System.out.println("-----------------------------------");

        List<Integer> listaMasLargaStream = conjuntoDeListas.stream()
                .max(Comparator.comparingInt(List::size))
                .orElse(List.of());
        System.out.println("Lista más larga: " + listaMasLargaStream);

        System.out.println("-----------------------------------");

        List<Integer> listaConMayorSumaStream = conjuntoDeListas.stream()
                .max(Comparator.comparingInt(lista -> lista.stream()
                        .mapToInt(Integer::intValue)
                        .sum()))
                .orElse(List.of());
        System.out.println("Lista con mayor suma: " + listaConMayorSumaStream);
    }
}
