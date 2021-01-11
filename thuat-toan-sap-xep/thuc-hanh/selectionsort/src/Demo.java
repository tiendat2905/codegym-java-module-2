import java.util.Arrays;

public class Demo {
    public static void selection(int[] arr) {
        //duyet mang
        for (int i = 0; i < arr.length; i++) {
            //cho phan tu hien tai la min
            int indexMin = i;
            //duyet mang de xem phan tu hien tai nho nhat chua
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[indexMin] > arr[j]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                System.out.println("doi phan tu " + arr[i] + " voi " + arr[indexMin]);
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
            System.out.println("vong lap thu " + (i + 1));
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 8, 9, 10, 15, 3, 6};
        System.out.println("mang dau vao");
        System.out.println(Arrays.toString(arr));
        selection(arr);
        System.out.println("sau khi doi");
        System.out.println(Arrays.toString(arr));

    }
}
