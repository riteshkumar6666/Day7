public class UC1 {
    public static void main(String[] args) {
        char board[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "    ");
            }
            //System.out.print();

            System.out.println("");
            System.out.println("--|------|----");
        }
    }
}