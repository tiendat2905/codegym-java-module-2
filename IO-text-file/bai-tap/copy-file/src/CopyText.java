import java.io.*;

public class CopyText {
    public static void main(String[] args) {

        {
            try {

                FileReader fileReader = new FileReader("source.txt");
                BufferedReader br = new BufferedReader(fileReader);
                BufferedWriter bw = new BufferedWriter(new FileWriter("target.txt"));

                String value;
                while ((value = br.readLine()) != null) {
                    bw.write(value);
                }
                br.close();
                bw.close();
            }catch (FileNotFoundException e){
                System.out.println("file khon ton tai");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
