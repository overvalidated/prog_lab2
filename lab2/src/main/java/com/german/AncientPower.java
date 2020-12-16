package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;


public class AncientPower extends SpecialMove {
    AncientPower() {
        super(Type.ROCK, 60, 100);
    }

    @Override
    public String describe() {
        return "casts Ancient Power";
    }

    @Override
    protected void applySelfEffects(Pokemon self) {
        Effect effect = new Effect().chance(0.1)
                .stat(Stat.ATTACK, 1)
                .stat(Stat.DEFENSE, 1)
                .stat(Stat.SPECIAL_ATTACK, 1)
                .stat(Stat.SPECIAL_DEFENSE, 1)
                .stat(Stat.SPEED, 1);

        self.addEffect(effect);
    }

}