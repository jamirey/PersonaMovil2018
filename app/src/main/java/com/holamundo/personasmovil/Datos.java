package com.holamundo.personasmovil;

import java.util.ArrayList;

public class Datos {

    private static ArrayList<Persona>persona = new ArrayList<>();

    public static void  guardar (Persona p){

        persona.add(p);

    }

    public static ArrayList<Persona> obtener(){

        return persona;
    }
}
