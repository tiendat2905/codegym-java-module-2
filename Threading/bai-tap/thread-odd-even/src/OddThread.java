public class OddThread extends Thread{
    private int number;
    @Override
    public void run(){
        for (int i =0; i < 10; i++){
            number = i;
            if (number % 2 != 0){
                System.out.println("số lẻ: " + number);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
