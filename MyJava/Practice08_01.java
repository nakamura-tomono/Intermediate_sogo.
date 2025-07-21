class Practice08_01 {
    public static void main(String[] args) {
        int gender = new java.util.Random().nextInt(2);

        if (gender == 0) {
            System.out.println("あなたは 男 です");
        } else {
            System.out.println("あなたは 女 です");
        }
    }
}