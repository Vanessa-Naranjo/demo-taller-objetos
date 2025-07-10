package com.lvnr.demo.taller.objetos;

import com.lvnr.demo.taller.objetos.dto.ProductoDto;
import com.lvnr.demo.taller.objetos.service.PersonaService;
import com.lvnr.demo.taller.objetos.service.ProductoService;

public class TallerObjetos {
    public static void main(String[] args) {
        PersonaService personaService=new PersonaService();
        //modificar probando

        personaService.crearPersona();
        personaService.consultaPersona();

        ProductoDto productoDto=new ProductoDto();
        ProductoService productoService=new ProductoService();

        productoDto.setNombreProducto("Iphone 16");
        productoDto.setCantidad(2);
        productoDto.setValor(2345876.00);

        productoService.imprimirProducto(productoDto);

    }


}
