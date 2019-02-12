package com.company.BoardGame;

public abstract class Player {
    private static char mark;

    public Player(char mark) {
        this.mark = mark;
    }

    public Move makeMove(Board board) {
        return null;
    }

    public static char getMark() {
        return mark;
    }
}
