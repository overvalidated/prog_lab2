package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bounsweet extends Pokemon {
    Bounsweet(String name) {
        super(name, 1);
        setType(Type.GRASS);
        setStats(42, 30, 38, 30, 38, 32);
        setMove(new TeeterDance(),
                new Swagger());
    }

}