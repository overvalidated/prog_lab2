package com.german.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;


public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    public String describe() {
        return "casts Shadow Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect debuff = new Effect()
                .chance(0.2)
                .stat(Stat.SPECIAL_DEFENSE, -1);

        opp.addEffect(debuff);
    }

}