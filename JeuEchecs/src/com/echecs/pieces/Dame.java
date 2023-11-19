package com.echecs.pieces;

import com.echecs.Position;

public class Dame extends Piece{
    public Dame(char couleur) {
        super(couleur);
    }

    @Override
    public boolean peutSeDeplacer(Position pos1, Position pos2, Piece[][] echiquier) {
        if (pos1.estVoisineDe(pos2))
            return true;
        if (pos1.estSurLaMemeLigneQue(pos2) && pos1.estSurLaMemeColonneQue(pos2))
            return true;
        if (pos1.estSurLaMemeDiagonaleQue(pos2))
            return true;
        else
            return false;
    }
}
