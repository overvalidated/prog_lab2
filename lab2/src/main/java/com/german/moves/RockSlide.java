package com.german.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;


public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    public String describe() {
        return "casts Rock Slide";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        if (Math.random() < 0.1) {
            Effect.flinch(opp);
        }
    }

}
