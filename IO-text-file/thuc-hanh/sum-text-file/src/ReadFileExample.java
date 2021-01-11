import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
   public void readFileText(String filePath){
       try {
           File file = new File(filePath);
           if (!file.exists()){
               throw new FileNotFoundException();
           }

           BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
           int sum = 0;
           while ((line = br.readLine()) != null){
               System.out.println(line);
               sum += Integer.parseInt(line);
           }
           br.close();
           System.out.println("Tong = " + sum);
       } catch (Exception e) {
           System.err.println("\"Fie không tồn tại or nội dung có lỗi!");
       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String path = scanner.nextLine();;

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }

}
