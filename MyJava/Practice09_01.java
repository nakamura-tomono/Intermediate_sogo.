class Practice09_01 {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i += 2) {
            if (i == 0 || i == 8 || i == 12 || i == 14 || i == 16 || i == 18) {
                continue;
            } 
            
            System.out.println(i);
        }
    }
}