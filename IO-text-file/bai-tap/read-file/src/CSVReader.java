import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("soure.txt");
            BufferedReader br = new BufferedReader(fileReader);

            String value;
            while ((value = br.readLine()) != null){
               String[] country = value.split(",");
                System.out.println("Country [code = " + country[4] + " , name = " + country[5] + "]");
            }
        } catch (FileNotFoundException e) {
            System.out.println("file khong ton tai");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
