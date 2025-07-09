package com.lvnr.demo.taller.objetos;

import com.lvnr.demo.taller.objetos.service.PersonaService;

public class TallerObjetos {
    public static void main(String[] args) {
        PersonaService personaService=new PersonaService();

        personaService.crearPersona();
        personaService.consultaPersona();
    }
}
