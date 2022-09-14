package seminar1.lesson;

public class task1 {
    private static final int MIN_ARRAY_LENGTH = 2;

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        int findNumber = 2;
        System.out.println(getArrayLength(arr, findNumber));
    }

    public static int getArrayLength(int[] array, int findNumber) {
        if (array.length <= MIN_ARRAY_LENGTH) {
            return -1;
        } else if (array == null) {
            return -3;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == findNumber) {
                    return i;
                }
            }
        }
        return -2;
    }
}
