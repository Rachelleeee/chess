package pieces;

import java.awt.image.BufferedImage;

import main.ChessBoard;

public class Rook extends Piece {
    public Rook(ChessBoard board, int collumn, int row, boolean isWhite) {
        super(board);
        this.collumn = collumn;
        this.row = row;
        this.xPos = collumn*board.tileSize;
        this.yPos = row*board.tileSize;

        this.isWhite = isWhite;
        this.name = "Rook";

        this.sprite = sheet.getSubimage(4*sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale).getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);


    }

    public boolean isValidMovement(int collumn, int row){
        return this.collumn == collumn || this.row == row;
    }
}