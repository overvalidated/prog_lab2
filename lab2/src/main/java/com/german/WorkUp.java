package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.StatusMove;


public class WorkUp extends StatusMove {
    WorkUp() {
        super();
        this.type = Type.NORMAL;
    }

    @Override
    public String describe() {
        return "casts Work Up";
    }

    @Override
    protected boolean checkAccuracy(Pokemon arg0, Pokemon arg1) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.addEffect(new Effect().
                stat(Stat.ATTACK, 1).
                stat(Stat.SPECIAL_ATTACK, 1));
    }

}