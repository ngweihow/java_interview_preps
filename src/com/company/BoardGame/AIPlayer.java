package com.company.BoardGame;

public class AIPlayer extends Player{

    public AIPlayer(char mark){
        super(mark);
    }

    @Override
    public Move makeMove(Board board) {
        for(int i=0; i<board.getGrid().length;i++){
            for(int j=0; j<board.getGrid()[i].length;j++){
                if(Character.toString(board.getGrid()[i][j]) == null ) {
                    return new Move(i, j);
                }
            }
        }

        return null;
    }
}
