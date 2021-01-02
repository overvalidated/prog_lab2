package com.german.moves;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;


public class Psychic extends SpecialMove {
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    public String describe() {
        return "casts Psychic";
    }

    @Override
    protected void applyOppEffects(Pokemon opp) {
        Effect debuff = new Effect()
                .chance(0.1)
                .stat(Stat.SPECIAL_DEFENSE, -1);
        opp.addEffect(debuff);
    }
    
}
