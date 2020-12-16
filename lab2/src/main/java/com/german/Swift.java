package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class Swift extends SpecialMove {
    Swift() {
        super(Type.NORMAL, 60, 100);
    }

    @Override
    public String describe() {
        return "casts Swift";
    }

    @Override
    protected boolean checkAccuracy(Pokemon arg0, Pokemon arg1) {
        return true;
    }



}