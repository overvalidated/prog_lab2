package com.german.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.StatusMove;


public class TeeterDance extends StatusMove {
    public TeeterDance() {
        super(Type.NORMAL, 100, 100);
    }

    @Override
    public String describe() {
        return "casts Teeter Dance";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect.confuse(opp);
    }

}