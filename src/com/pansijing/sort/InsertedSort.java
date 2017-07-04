package com.pansijing.sort;

/**
 * @author pighead4u
 * @time 2017/7/4-17:10.
 * @desc
 */
public class InsertedSort extends BaseSort implements Sort{

    @Override
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }

            printData(a);
        }
    }
}
