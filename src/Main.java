import task.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[]{9,8,7,6,5,4,3,2,1};
        int arraylen = array.length;
        System.out.println("Задача №1");
        Task1.run(array, arraylen );
        System.out.println("Задача №2");
        Task2.run();
        System.out.println("Задача №3");
        Task3.run();
    }
}