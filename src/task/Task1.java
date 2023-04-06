package task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {

    public static void run(int[] array, int len) throws IOException {
        try (FileWriter writer = new FileWriter("task1.txt")) {

            System.out.println(Arrays.toString(array));
            writer.write(Arrays.toString(array) + "исходный массив " + "\n");
            if (len < 2) {
                return;
            }
            int left = len / 2;
            int right = len - left;
            int[] array1 = new int[left];
            int[] array2 = new int[right];
            for (int i = 0; i < left; i++) {
                array1[i] = array[i];
            }
            for (int i = left; i < len; i++) {
                array2[i - left] = array[i];
            }
            writer.write(Arrays.toString(array1) + "массив левый" + "\n");
            writer.write(Arrays.toString(array2) + "массив правый" + "\n");
            run(array1, left);

            run(array2, right);

            merge(array, array1, array2, left, right, len);
            writer.write(Arrays.toString(array1) + "2 массив левый" + "\n");
            writer.write(Arrays.toString(array2) + "2 массив правый" + "\n");
            System.out.println(Arrays.toString(array));

            writer.write(Arrays.toString(array) + "отсортированный массив" + "\n");
        }
    }

    public static void merge(int[] array, int[] array1, int[] array2, int left, int right, int len) {
        int i = 0;
        int j = 0;
        int k = 0;

//_____________________________________________
        while (i < left && j < right) {
            if (array1[i] <= array2[j]) {
                array[k++] = array1[i++];
            } else {
                array[k++] = array2[j++];
            }
        }
        while (i < left) {
            array[k++] = array1[i++];
        }
        while (j < right) {
            array[k++] = array2[j++];
        }
    }
}
//        ________________________________________________________
//
//        for (i = 0, j = 0; i < left && j < right; i++, j++, k++) {
//            if (array1[i] <= array2[j]) {
//                array[k] = array1[i];
//            } else {
//                array[k] = array2[j];
//            }
//        }
//        int count = 0, count1 = 0;
//        for (i = 0, j = 0; i < left && j < right; i++, j++, k++) {
//            if (array2[j] > array1[i]) {
//                array[k] = array2[j];
//            } else {
//                array[k] = array1[i];
//            }
//            count++;
//            count1 = k;
//        }
//        for(i=count;i<left; i++){
//            array[k]=array1[i];
//        }
//        for(j=count;j<right; j++){
//            array[k]=array2[j];
//        }
//
//    }
//}


