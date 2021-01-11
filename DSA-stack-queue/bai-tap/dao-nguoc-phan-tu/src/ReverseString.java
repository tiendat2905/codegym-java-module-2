import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String word = "hna uey me";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++){
            stack.push(word.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++){
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder);
    }
}
