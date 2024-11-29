package org.iesvdm.exercise5;

import java.util.*;
import java.util.stream.Collectors;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Set<Integer>> list = new ArrayList<>();

        System.out.println("Introduce varios números en diferentes líneas: ");
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            Set<Integer> set = Arrays.stream(line.split("\\s+"))
                    .filter(num -> num.matches("\\d+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toSet());
            list.add(set);
        }

        System.out.println("La lista tiene: ");
        list.forEach(set -> System.out.println(set));

        // Comparar resultados cuando hay duplicados
        System.out.println("\nComparación: ");
        for (int i = 0; i < list.size(); i++) {
            Set<Integer> currentSet = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (currentSet.equals(list.get(j))) {
                    System.out.println("Línea " + (i + 1) + " es igual a la línea " + (j + 1));
                }
            }
        }
    }
}
