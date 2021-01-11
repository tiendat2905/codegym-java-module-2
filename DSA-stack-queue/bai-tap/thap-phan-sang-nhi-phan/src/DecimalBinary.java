import java.util.Scanner;
import java.util.Stack;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap so thap phan: ");
//        int num = scanner.nextInt();
//        Stack<String> stack = new Stack<>();
//        while (num != 0) {
//            stack.push(num % 2);
//            num = num / 2;
//        }
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop());
//        }
//        System.out.println(" ");
//
//        System.out.println("nhap nhi phan: ");
//        int number = scanner.nextInt();
//        Stack<Character> stack1 = new Stack<>();
//        String string = Integer.toString(number);
//        for (int i = 0; i < string.length(); i++){
//            stack1.push(string.charAt(i));
//        }
//        int i = 0;
//        int decimalNum = 0;
//        while (!stack1.isEmpty()){
//            int n = Integer.parseInt(String.valueOf(stack1.pop()));
//            decimalNum += (int) (n * Math.pow(2, i++));
//        }
//        System.out.println(decimalNum);
//        System.out.println(" ");

        String[] strings = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        System.out.println("nhap so thap phan: ");
        String number2 = strings[scanner.nextInt()];
        Stack<String> stack2 = new Stack<>();
        for (String s : strings){
            stack2.push(s);
        }
        for (int j = 0; j < strings.length; j++){
            strings[j] = stack2.pop();
        }

    }
}
