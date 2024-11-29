package org.iesvdm.exercise2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class exercise2 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        // Crear una lista de palabras
        List<String> palabras = List.of("manzana", "plátano", "naranja", "uva", "manzana", "pera");

        // Añadir palabras al HashSet (los duplicados serán eliminados automáticamente)
        System.out.println("HashSet (sin orden):");
        hashSet.addAll(palabras);
        hashSet.forEach(palabra -> System.out.println("HashSet contiene: " + palabra));

        // Añadir palabras al TreeSet (los duplicados serán eliminados y se aplicará ordenación)
        System.out.println();
        System.out.println("--------------------");
        System.out.println("TreeSet (ordenado):");
        treeSet.addAll(palabras);
        treeSet.forEach(palabra -> System.out.println("TreeSet contiene: " + palabra));
    }
}
