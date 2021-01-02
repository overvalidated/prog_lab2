package com.german.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import com.german.moves.*;

public class Espeon extends Eevee {
    public Espeon(String name) {
        super(name);
        setStats(65, 65, 60, 130, 95, 110);
        addMove(new DreamEater());
    }

}
