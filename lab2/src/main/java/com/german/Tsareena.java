package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Tsareena extends Pokemon {
    Tsareena(String name) {
        super(name, 1);
        setType(Type.GRASS);
        setStats(72, 120, 98, 50, 98, 72);
        setMove(new TeeterDance(),
                new Swagger(),
                new PlayNice(),
                new Rest());
    }

}
