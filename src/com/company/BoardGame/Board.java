package com.company.BoardGame;

public class Board {
    private char[][] grid;
    public static final int BOARD_SIZE = 3;

    public Board(){
        grid = new char[BOARD_SIZE][BOARD_SIZE];
    }

    public boolean isValidMove(Move move){
        int row = move.getRow();
        int column = move.getColumn();
        if(Character.toString(grid[row][column]) != null) {
            return true;
        }
        return false;
    }

    /**
     * Check if board is currently full
     * @return boolean representing state of game
     */
    public boolean boardIsFull() {
        for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if(Character.toString(grid[i][j]) == null ) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean playerWins(Player player, Move move) {

        return false;
    }

    public void makeMove(Player player, Move move) {
        grid[move.getRow()][move.getColumn()] = player.getMark();
    }

    // Getter
    public char[][] getGrid() {
        return grid;
    }
}
