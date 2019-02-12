package com.company.BoardGame;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(char mark){
        super(mark);
    }

    @Override
    public Move makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Human Player please enter two numbers: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        if (row <= Board.BOARD_SIZE  && column <= Board.BOARD_SIZE) {
            return new Move(--row, --column);
        }


        return null;
    }
}
