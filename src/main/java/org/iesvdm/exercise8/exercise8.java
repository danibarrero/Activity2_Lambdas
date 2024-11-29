package org.iesvdm.exercise8;

import java.util.*;

public class exercise8 {
    public static void main(String[] args) {
        HashSet<List<Integer>> hashSet = new HashSet<>(List.of(
                List.of(10, 20, 30),
                List.of(40, 50, 1, 5),
                List.of(60, 70, 80)
        ));

        Comparator<List<Integer>> byLength = Comparator.comparingInt(List::size);
        Comparator<List<Integer>> bySum = Comparator.comparingInt(list -> list.stream()
                .mapToInt(Integer::intValue)
                .sum());

        List<Integer> tamaño = Collections.max(hashSet, byLength);
        List<Integer> suma = Collections.max(hashSet, bySum);

        System.out.println("Por tamaño: " + tamaño);
        System.out.println("Por suma: " + suma);

        tamaño = hashSet.stream().max(byLength).orElse(Collections.emptyList());
        suma = hashSet.stream().max(bySum).orElse(Collections.emptyList());

        System.out.println("----------------- Stream -----------------");
        System.out.println("Por tamaño: " + tamaño);
        System.out.println("Por suma: " + suma);
    }
}
