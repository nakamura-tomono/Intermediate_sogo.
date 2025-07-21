import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 1 ~ 5 までの整数を入力してください");
        int inputNum = sc.nextInt();

        if (inputNum > 0 && inputNum < 6) {
            for (int i = 0; i < inputNum; i++) {
                for (int j = inputNum; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println(" 1 ~ 5 までの整数を入力してください");
        }

        sc.close();
    }
}