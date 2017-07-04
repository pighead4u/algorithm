package com.pansijing.sort;

/**
 * @author pighead4u
 * @time 2017/7/4-13:24.
 * @desc
 */
public class SelectedSort extends BaseSort  implements Sort{

    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }

            exch(a, i, min);

            printData(a);
        }
    }
}
