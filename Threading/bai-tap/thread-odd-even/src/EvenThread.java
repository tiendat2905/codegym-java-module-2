public class EvenThread extends Thread {
    private int number;
    @Override
    public void run(){
        for (int i =0; i < 10; i++){
            number = i;
            if (number % 2 == 0){
                System.out.println("số chẵn: " +  number);
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
