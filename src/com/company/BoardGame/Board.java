package com.company.BoardGame;

public class Board {
    public char[][] grid;

    public Board(){
        grid = new char[3][3];
    }

    public boolean isValidMove(Move move){
        int row = move.getRow();
        int column = move.getColumn();
        if(grid[row][column] != null) {

        }
    }
}
