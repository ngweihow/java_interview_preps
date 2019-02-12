package com.company.BoardGame;

public class Main {
    private static Board board;
    public static void main(String[] args) {
        board = new Board();

        Player humanPlayer = new HumanPlayer('X');
        Player aiPlayer = new AIPlayer('O');

        while(!board.boardIsFull()) {
            Move aiMove = aiPlayer.makeMove(board);

            if(!board.boardIsFull() && !board.playerWins(aiPlayer, aiMove)){
                humanPlayer.makeMove(board);
            }

            if(!board.boardIsFull() && !board.playerWins(aiPlayer, aiMove)){

            }
        }

    }


}
