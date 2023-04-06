////Пусть дан произвольный список целых чисел, удалить из него чётные числа

package task;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void run() {

        Integer[] array = {21, 15, 14, 7, 8, 10, 12, 16, 17};
        System.out.println(Arrays.toString(array));
        int[] array1 = new int[array.length];

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {

                array1[i] = array[i];
            }
        }
        for (int l : array1) {
            list1.add(l);
        }
        list1.removeAll(Collections.singleton(0));
        System.out.println(list1);
    }
}
