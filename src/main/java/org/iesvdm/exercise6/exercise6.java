package org.iesvdm.exercise6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class exercise6 {
    public static void main(String[] args) {
        HashSet<List<Integer>> listas = new HashSet<>(List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(1, 2, 3, 4, 5, 6),
                List.of(1, 2),
                List.of(10, 20, 30, 40, 50, 60, 70, 80),
                List.of(5, 6, 7, 8, 9)
        ));

        System.out.println(maxSum(listas));
    }

    private static List<Integer> maxSum(HashSet<List<Integer>> conjuntoDeListas) {
        return conjuntoDeListas.stream()
                .reduce((lista1, lista2) -> sumaDeLista(lista1) > sumaDeLista(lista2) ? lista1 : lista2)
                .orElse(new ArrayList<>());
    }

    private static int sumaDeLista(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).sum();
    }
}
