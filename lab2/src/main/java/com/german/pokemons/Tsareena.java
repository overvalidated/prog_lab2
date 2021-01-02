package com.german.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.german.moves.*;

public class Tsareena extends Steenee {
    public static int PI = 3;

    public Tsareena(String name) {
        super(name);
        setStats(72, 120, 98, 50, 98, 72);
        addMove(new Rest());
    }
}
