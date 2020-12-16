package com.german;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Steenee extends Pokemon {
    Steenee(String name) {
        super(name, 1);
        setType(Type.GRASS);
        setStats(52, 40, 48, 40, 48, 62);
        setMove(new TeeterDance(),
                new Swagger(),
                new PlayNice());
    }

}
