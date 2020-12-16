package com.german;

import java.lang.Math;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Status;


public class DreamEater extends SpecialMove {
    DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    public String describe() {
        return "casts Dream Eater";
    }

    @Override
    protected double calcRandomDamage(Pokemon self, Pokemon opp) {
        return opp.getCondition().equals(Status.SLEEP) ? super.calcRandomDamage(self, opp) : 0.0;
    }

    @Override
    protected void applySelfDamage(Pokemon self, double damage) {
        self.setMod(Stat.HP, (int)-Math.round(damage/2));
    }

}