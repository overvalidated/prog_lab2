package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Espeon extends Pokemon {
    Espeon(String name) {
        super(name, 1);
        setType(Type.PSYCHIC);
        setStats(65, 65, 60, 130, 95, 110);
        setMove(new ShadowBall(),
                new Swift(), 
                new WorkUp(), 
                new DreamEater());
    }

}
