package src.main.java.Caro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String ans;
        do {
            Game game = new Game();
            game.start();
            System.out.println("Play again? YES or NO");
            ans = scan.next();
            System.out.println(ans);
        } while (ans.charAt(0) != 'N');
    }
}