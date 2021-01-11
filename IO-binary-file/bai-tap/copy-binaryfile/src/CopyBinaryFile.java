import java.io.*;

public class CopyBinaryFile implements Serializable {
    public static void copyFile(){
        try {
            FileInputStream is = new FileInputStream(new File("data.txt"));
            FileOutputStream os = new FileOutputStream(new File("copy.txt"));

            byte[] buffer = new byte[1];
            while (is.read(buffer)  != -1){
                os.write(buffer);
            }
            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copyFile();
    }
}
