import java.util.Scanner;

public class UC6 {
    public static void main(String[] args) {
        System.out.println( " ");
    }

    static Scanner input = new Scanner(System.in);

    // Using toss to check who plays first
    public static String whoPlaysFirst() {
        int randomNumber = (int) Math.floor(Math.random() * 10) % 2;
        String player = "";

        if(randomNumber == 1)
            player = "User";
        else
            player = "Computer";

        System.out.println("\n" + player + " starts first.");

        return player;
    }
}