class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {

        
        int man = new java.util.Random().nextInt(3) + 1; 
        int woman = new java.util.Random().nextInt(3) + 1; 
        int child = new java.util.Random().nextInt(3) + 1; 

        System.out.println("man: " + man);
        System.out.println("woman: " + woman);
        System.out.println("child: " + child);     

        //あいこの場合
        if (man == woman && woman == child) {
            System.out.println("あいこです");
        } else if (man != woman && woman != child && man != child) {
            System.out.println("あいこです");

        //1人勝ちの場合
        } else if ((man == 3 && woman == 2 && child == 2) || (man == 2 && woman == 1 && child == 1) || (man == 1 && woman == 3 && child == 3)) {
               System.out.println("man" + "が勝ちました"); 
        }
        if ((woman == 3 && child == 2 && man == 2) || (woman == 2 && child == 1 && man == 1) || (woman == 1 && child == 3 && man == 3)) {
            System.out.println("woman" + "が勝ちました");
        }
        if ((child == 3 && man == 2 && woman == 2) || (child == 2 && man == 1 && woman == 1) || (child == 1 && man == 3 && woman == 3)) {
                System.out.println("child" + "が勝ちました");
        }  

        //2人勝ちの場合
        if ((man == 3 && woman == 3 && child == 2) || (man == 2 && woman == 2 && child == 1) || (man == 1 && woman == 1 && child == 3)) {
            System.out.println("man" + "と" + "woman" + "が勝ちました"); 
        }
        if ((woman == 3 && child == 3 && man == 2) || (woman == 2 && child == 2 && man == 1) || (woman == 1 && child == 1 && man == 3)) {
            System.out.println("woman" + "と" + "child" + "が勝ちました");
        }
        if ((child == 3 && man == 3 && woman == 2) || (child == 2 && man == 2 && woman == 1) || (child == 1 && man == 1 && woman == 3)) {
            System.out.println("man" + "と" + "child" + "が勝ちました");
        }  
    }
}
        
      

