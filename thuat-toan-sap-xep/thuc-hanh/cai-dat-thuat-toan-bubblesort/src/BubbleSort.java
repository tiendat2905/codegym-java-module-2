import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        boolean nextNeedPass = true;
        for (int k = 1; k < arr.length && nextNeedPass; k++){
            nextNeedPass = false;
            try {
                for (int i =0; i < arr.length; i++){
                    if (arr[i] < arr[i+1]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;

                        nextNeedPass = true;
                    }
                }
            } catch (Exception ex) {

            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
