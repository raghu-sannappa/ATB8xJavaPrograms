package ex_18092024;

public class SortIntegerArray {
    public static void main(String[] args) {
        int[] arr = {20, 60, 40, 10, 50, 30};
        int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }

    }
}
