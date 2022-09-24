package seminar1.homework;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 1, 0, 1, 5};
        System.out.println(Arrays.toString(method(array1, array2)));
    }

    public static int[] method(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new ArrayIndexOutOfBoundsException("Different length of arrays");
        }
        int[] array = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array[i] = array1[i] - array2[i];
        }
        return array;
    }
}
