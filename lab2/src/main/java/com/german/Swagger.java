package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.StatusMove;


public class Swagger extends StatusMove {
    Swagger() {
        super();
        this.type = Type.NORMAL;
        this.accuracy = 85;
    }

    @Override
    public String describe() {
        return "casts Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect.confuse(opp);
        opp.setMod(Stat.ATTACK, 1);
    }

}
