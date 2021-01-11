import java.util.Arrays;

public class Demo2 {
    public static void selectionSort(double[] list){
        for (int i =0; i< list.length; i++){
            double currentMin = list[i];
            int currentMinIndex =i;

            for (int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {1,3,6,2,8,5,523,53,7};
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
