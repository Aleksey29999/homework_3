//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

package task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void run() {
        int mid = 0;
        List<Integer> List = new ArrayList<>();
        int[] list = new int[]{21, 15, 14, 7, 8, 10, 12, 16, 17};
        Arrays.sort(list);
        int min = list[0];
        int n = list.length;
        int max = list[n-1];
        for (int i = 0; i < n; i++) {
            mid += list[i];
        }
        System.out.println("min= " + min );
        System.out.println("max= " + max);
        System.out.println("average= " + mid );
        {
        }

    }

}

