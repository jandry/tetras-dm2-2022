package com.tetras;

import java.util.Arrays;

public class Herbizarre extends Pokemon implements IEvoluable {

    public Herbizarre() {
        super(Arrays.asList(Type.Plante, Type.Poison));
    }

    @Override
    public Pokemon evoluer() {
        return new Florizarre();
    }

}