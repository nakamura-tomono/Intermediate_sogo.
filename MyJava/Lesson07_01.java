import java.util.Scanner;

class Lesson07_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("自然数を入力してください >");
        int inputNum = sc.nextInt();

        System.out.println("入力された値は " + inputNum + "です");

        sc.close();
    }
}