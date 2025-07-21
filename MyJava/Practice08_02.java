class Practice08_02 {
    public static void main(String[] args) {
        int age = new java.util.Random().nextInt(21);


        if (age <= 3) {
            System.out.println("あなたは baby です");
        } else if (age < 18) {
            System.out.println("あなたは kid です");
        } else {
            System.out.println("あなたは adult です");

        }
        
    }
}
