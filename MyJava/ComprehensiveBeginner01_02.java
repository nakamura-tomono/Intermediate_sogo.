import java.util.Random;

public  class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {

        Random rand = new java.util.Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (sum > 100) {
                break;
            } 

            int num = rand.nextInt(100) + 1;
            
            sum += num;
            
            System.out.println("入力された値:" + num);
        }
        System.out.println("合計値:" + sum);
    }
}
