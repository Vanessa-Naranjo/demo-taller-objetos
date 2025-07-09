package com.lvnr.demo.taller.objetos.service;

import com.lvnr.demo.taller.objetos.dto.PersonaDto;

public class PersonaService {

    private PersonaDto personaDto;

    public void crearPersona(){
        this.personaDto=new PersonaDto();
        this.personaDto.setApellido("Romero");
        this.personaDto.setNombre("Camilo");
        this.personaDto.setCedula(1016834);
    }

    public void consultaPersona(){
        System.out.println("Nombre: " +this.personaDto.getNombre());
        System.out.println("Apellido: " +this.personaDto.getApellido());
        System.out.println("Cedula: " +this.personaDto.getCedula());
    }
}