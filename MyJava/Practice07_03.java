import java.util.Scanner;

class Practice07_03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("自然数を入力してください >");
        int inputNum = sc.nextInt();

        System.out.println("10 を 3 で割ったあまりは " + inputNum % 3 + "です");

        sc.close();
    }
}