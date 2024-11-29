package org.iesvdm.exercise9;

import java.util.*;

public class exercise9 {
    public static void main(String[] args) {
        HashSet<List<Integer>> conjuntoHash = new HashSet<>(List.of(
                List.of(10, 20, 30),
                List.of(40, 50, 1, 5),
                List.of(60, 70, 80)
        ));

        Comparator<List<Integer>> porTamaño = (lista1, lista2) -> {
            int compararTamaño = Integer.compare(lista1.size(), lista2.size());
            if (compararTamaño == 0) {
                int suma1 = lista1.stream().mapToInt(Integer::intValue).sum();
                int suma2 = lista2.stream().mapToInt(Integer::intValue).sum();
                return Integer.compare(suma2, suma1);
            }
            return compararTamaño;
        };

        Comparator<List<Integer>> porSuma = (lista1, lista2) -> {
            int compararSuma = Integer.compare(lista1.stream()
                            .mapToInt(Integer::intValue)
                            .sum(),
                    lista2.stream().mapToInt(Integer::intValue).sum());

            if (compararSuma == 0) {
                return Integer.compare(lista2.size(), lista1.size());
            }

            return compararSuma;
        };

        List<Integer> tamaño = Collections.max(conjuntoHash, porTamaño);
        List<Integer> suma = Collections.max(conjuntoHash, porSuma);

        System.out.println("Por tamaño y por suma: " + tamaño);
        System.out.println("Por suma y por tamaño: " + suma);

        tamaño = conjuntoHash.stream().max(porTamaño).orElse(Collections.emptyList());
        suma = conjuntoHash.stream().max(porSuma).orElse(Collections.emptyList());

        System.out.println("----------------- Stream -----------------");
        System.out.println("Por tamaño y por suma: " + tamaño);
        System.out.println("Por suma y por tamaño: " + suma);
    }
}
