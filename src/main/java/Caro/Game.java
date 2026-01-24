package src.main.java.Caro;

import java.util.Scanner;

public class Game {
    public int turn;
    public Board board;
    public Player player1;
    public Player player2;

    public Game() {
        this.turn = 1;
        this.board = new Board(10);
        System.out.print("Enter player 1 name: ");
        Scanner sc = new Scanner(System.in);
        String player1name = sc.next();
        System.out.print("Enter player 2 name: ");
        String player2name = sc.next();
        this.player1 = new Player(player1name, 'X');
        this.player2 = new Player(player2name, 'O');
    }
}


// public void start() {
    //     Scanner inp = new Scanner(System.in);
    //     while(!board.isWin())
    //     {
    //         if(turn % 2 == 1) {
    //             int x1Play, y1Play;
    //             do {
    //                 System.out.print("x: ");
    //                 x1Play = inp.nextInt();
    //                 System.out.print("y: ");
    //                 y1Play = inp.nextInt();
    //             } while (!board.isValid(x1Play, y1Play));
    //             board.playSymbol('X', x1Play, y1Play);
    //         }
    //         else {
    //             int x2Play, y2Play;
    //             do {
    //                 System.out.print("x: ");
    //                 x2Play = inp.nextInt();
    //                 System.out.print("y: ");
    //                 y2Play = inp.nextInt();
    //             } while (!board.isValid(x2Play, y2Play));
    //             board.playSymbol('O', x2Play, y2Play);
    //         }
    //         board.printBoard();
    //         turn++;
    //     }
    //     if(turn % 2 == 1) System.out.println("Congratulation! Player 2 is the Winner");
    //     else System.out.println("Congratulation! Player 1 is the Winner");
    //     return;
    //}