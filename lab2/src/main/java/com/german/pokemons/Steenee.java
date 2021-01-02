package com.german.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.german.moves.*;

public class Steenee extends Bounsweet {
    public Steenee(String name) {
        super(name);
        setType(Type.GRASS);
        setStats(52, 40, 48, 40, 48, 62);
        addMove(new PlayNice());
    }

}
