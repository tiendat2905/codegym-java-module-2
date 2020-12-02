public class FizzBuzzTranslate {

    private static String[] arr = {" ","Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam", "Chin"};
    public static String translate(int number){
        if (number % 3 == 0 && number % 5 ==0){
            return "FizzBuzz";
        }
        if (number % 3 == 0){
            return "Fizz";
        }
        if (number % 5 == 0){
            return "Buzz";
        }
        return number + "";
    }
    public static String readNumber(int number){
        int firstNumber = number / 10;
        int secondNumber = number % 10;
        if (firstNumber == 1 && secondNumber == 0){
            return "muoi";
        }
        return arr[firstNumber] + " " + (secondNumber == 0 ? "muoi" : arr[secondNumber]);
    }
}
