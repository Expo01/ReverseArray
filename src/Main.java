import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nonReversedArray = {5, 4, 3, 2, 1};
        reverse(nonReversedArray);
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}