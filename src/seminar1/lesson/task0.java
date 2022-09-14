package seminar1.lesson;

public class task0 {
    private static final int MIN_ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        System.out.println(getArrayLength(arr));
    }

    public static int getArrayLength(int[] array){
        if (array.length <= MIN_ARRAY_LENGTH){
            return -1;
        }
        else{
            return array.length;
        }
    }
}
