package edu.codeschool.training.generics;

import java.util.Arrays;

public class TestCollection {
    public static void main(String[] args) throws CollectionsFullException {
        Integer [] arr = new Integer[12];
        Collection<Integer> collection = new Collection<>(15,arr);
        collection.add(12);
        collection.add(11);
        System.out.println(Arrays.toString(arr));
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection.contains(10));
        System.out.println(collection.get(13));

    }
}
