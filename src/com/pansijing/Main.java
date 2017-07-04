package com.pansijing;

import com.pansijing.sort.InsertedSort;
import com.pansijing.sort.SelectedSort;

public class Main {

    public static void main(String[] args) {
        testSelectedSort();
        System.out.println("\n------------------------");
        testInsertedSort();
    }

    public static void testSelectedSort() {
        String[] data = {"f", "d", "m", "y", "a", "s", "l", "p"};
        SelectedSort selectedSort = new SelectedSort();
        selectedSort.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println(selectedSort.isSorted(data));
    }

    public static void testInsertedSort() {
        String[] data = {"f", "d", "a", "s", "l", "p"};
        InsertedSort selectedSort = new InsertedSort();
        selectedSort.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }

        System.out.println(selectedSort.isSorted(data));
    }

}
