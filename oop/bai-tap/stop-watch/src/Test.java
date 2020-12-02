import java.util.Random;

public class Test {
    public static void main(String[] args) {
        StopWatch test = new StopWatch();
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++){
            array[i] = random.nextInt(10000);
        }

        test.start();
        sortAscending(array);
        test.stop();
        System.out.println(test.getElapsedTime());

    }

    public static void sortAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentMin = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < currentMin) {
                    currentMin = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }
}
