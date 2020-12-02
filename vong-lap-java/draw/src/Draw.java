public class Draw {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++){
            System.out.println("* * * * * *");
        }

        for (int i = 1; i <= 5; i++){
            System.out.println("");
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        }
        System.out.println("");

        for (int i = 1; i <= 5; i++){
            System.out.println("");
            for (int j = 1; j <= 6 - i; j++){
                System.out.print("* ");
            }
        }
        System.out.println("");

        for (int i = 0; i<=8; i++) {
            System.out.print(i == 4 ? "*" : " ");
        }
        System.out.println("");
        for (int i = 0; i<=8; i++){
            System.out.print(i == 3 || i ==5 ? "*" : " ");
        }
        System.out.println("");
        for (int i = 0; i<=8; i++) {
            System.out.print(i == 2 || i == 4 || i == 6 ? "*" : " ");
        }
        System.out.println("");
        for (int i = 0; i<=8; i++) {
            System.out.print(i % 2 != 0 ? "*" : " ");
        }
        System.out.println("");
        for (int i = 0; i<=8; i++) {
            System.out.print(i % 2 == 0 ? "*" : " ");
        }
        System.out.println("");
    }
}
