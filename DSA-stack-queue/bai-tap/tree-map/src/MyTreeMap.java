import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {

        Map<Character, Integer> map = new TreeMap<>();
        String word;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap test: ");
        word = scanner.nextLine();
        
        String format = word.toUpperCase();
        System.out.println(format);

        //duyet qua tung chu cai
        //lay chu cai hien tai ra
        //gap khoang trong thi bo qua
        //lay ve chu cai hien co trong map
        //th1: chua co -> them chu cai vao map, voi so lan la 1
        //th2: co roi -> lay ve so lan xuat hien trong map
        //chen chu cai do vo lai map voi so lan xuat hien tang len 1
        //duyet qua tung phan tu trong danh sach
        //get: lay ra so lan xuat hien, in ra man hinh

        for (int i = 0; i < format.length(); i++) {
            char thisWord = format.charAt(i);
            if (thisWord == ' ') {
                continue;
            }
            if (!map.containsKey(thisWord)) {
                map.put(thisWord, 1);
            } else {
                map.put(thisWord, map.get(thisWord) + 1);
            }
        }
        for (Character character : map.keySet()){
            System.out.println(character + ": " + map.get(character));
        }
    }
}

