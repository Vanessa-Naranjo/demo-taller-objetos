package com.lvnr.demo.taller.objetos.dto;

public class PersonaDto {
    private String nombre;
    private String apellido;
    private int cedula;

    public void setNombre (String nombre) {this.nombre=nombre;}
    public String getNombre () {return this.nombre;}

    public void setApellido (String apellido) {this.apellido=apellido;}
    public String getApellido () {return this.apellido;}

    public void setCedula (int cedula) {this.cedula=cedula;}
    public int getCedula () {return this.cedula;}
}
