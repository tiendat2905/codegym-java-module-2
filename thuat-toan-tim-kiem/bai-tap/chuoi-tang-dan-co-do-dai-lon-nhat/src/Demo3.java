import java.util.Arrays;

public class Demo3 {
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] list = {5,-3,4,2,7,1,3,8,9};
        insertionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
