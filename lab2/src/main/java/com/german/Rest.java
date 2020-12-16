package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.StatusMove;


public class Rest extends StatusMove {
    Rest() {
        super(Type.NORMAL, 100, 100);
    }

    @Override
    public String describe() {
        return "casts Rest";
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        self.setMod(Stat.HP, -(int)(self.getStat(Stat.HP)-self.getHP()));
        self.setCondition(new Effect().turns(2).condition(Status.SLEEP));
    }

}