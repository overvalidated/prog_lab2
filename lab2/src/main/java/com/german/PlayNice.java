package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;


public class PlayNice extends StatusMove {
    PlayNice() {
        super();
        this.type = Type.NORMAL;
    }

    @Override
    public String describe() {
        return "casts Play Nice";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        opp.setMod(Stat.ATTACK, -1);
    }

}