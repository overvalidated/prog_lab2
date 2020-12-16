package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
    Eevee(String name) {
        super(name, 1);
        setType(Type.NORMAL);
        setStats(55, 55, 50, 45, 65, 55);
        setMove(new ShadowBall(),
                new Swift(),
                new WorkUp());
    }

}
