package com.echecs.pieces;

import com.echecs.Position;

public class Pion extends Piece{
    public Pion(char couleur) {
        super(couleur);
    }

    @Override
    public boolean peutSeDeplacer(Position pos1, Position pos2, Piece[][] echiquier) {
        if (pos1.estSurLaMemeColonneQue(pos2))
            if (pos2.getLigne()== pos1.getLigne() + 1 || pos2.getLigne() == pos1.getLigne() + 2)
                return true;
            if (pos2.getLigne()== pos1.getLigne() + 1 || pos2.getColonne() == pos1.getColonne() + 1)
                return true;
        else
            return false;
    }
}
