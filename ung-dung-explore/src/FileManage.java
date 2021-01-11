import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManage {
   static Scanner scanner = new Scanner(System.in);

    public static void addFile(){
        try {
        System.out.println("Nhập tên file mới");
        String newFile = scanner.nextLine();
        File file = new File("G:\\Module 2\\ung-dung-explore\\Baitap" + newFile);
            if (file.createNewFile()){
                System.out.println("Tạo file thành công!");
            }else {
                for (int i = 1; ; i++){
                    file = new File("G:\\Module 2\\ung-dung-explore\\Baitap" + newFile + i);
                    if (file.createNewFile()){
                        System.out.println("Tạo file thành công! Số thứ tự tăng 1 theo số lần trùng");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
