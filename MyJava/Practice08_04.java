class Practice08_04 {
    public static void main(String[] args) {
        int color = new java.util.Random().nextInt(5) + 1;
        
        if (color == 1) {
            System.out.println("今日のラッキーカラーは ピンク です");
        } else if (color == 2 || color == 3 || color == 4){
            System.out.println("今日のラッキーカラーは レッド です");
        } else {
            System.out.println("今日のラッキーカラーは ゴールド です");
        }
        
    }
}
