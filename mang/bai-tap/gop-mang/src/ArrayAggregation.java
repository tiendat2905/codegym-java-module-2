import java.util.Arrays;

public class ArrayAggregation {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {2,3,4};

        int aArray1 = array1.length;
        int bArray2 = array2.length;
        int cArray3 = array1.length + array2.length;
        int[] array3 = new int[cArray3];

        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        int j = 0;
        for (int i = 3; i < array3.length; i++){
           array3[i] = array2[j];
           j++;
        }
        System.out.print(Arrays.toString(array3));
    }
}
