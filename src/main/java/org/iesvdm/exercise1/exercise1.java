package org.iesvdm.exercise1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class exercise1 {
    public static void main(String[] args) {
        int externalInteger = 30;

        // Comparador que compara los números según su proximidad al valor externo
        Comparator<Integer> comparator = (a, b) -> {
            int A = Math.abs(externalInteger - a);
            int B = Math.abs(externalInteger - b);
            return Integer.compare(A, B);
        };

        List<Integer> numbers = Arrays.asList(45, 15, 25, 35, 50);

        // Ordenamos la lista usando el comparador
        numbers.sort(comparator);
        System.out.println("Lista ordenada: " + numbers);

        // Creamos un TreeSet usando el comparador
        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
        treeSet.addAll(numbers);
        System.out.println("TreeSet ordenado: " + treeSet);

        // Usamos un Stream para ordenar y mostrar los resultados
        System.out.println("Stream ordenado:");
        numbers.stream().sorted(comparator).forEach(System.out::println);
    }

}
