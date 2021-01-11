import java.io.*;

public class CopyFile {
    public static void main(String args[]) throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("G:\\Module 2\\xu-ly-ngoai-le-debug\\bai-tap\\illegal-triangle-exception\\input.txt");
            out = new FileOutputStream("G:\\Module 2\\xu-ly-ngoai-le-debug\\bai-tap\\illegal-triangle-exception\\output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}