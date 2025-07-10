package com.lvnr.demo.taller.objetos.service;

import com.lvnr.demo.taller.objetos.dto.ProductoDto;

public class ProductoService {

    public void imprimirProducto (ProductoDto productoDto){
        System.out.println("Nombre del producto: " +productoDto.getNombreProducto());
        System.out.println("Cantidad del producto: " +productoDto.getCantidad());
        System.out.println("Valor del producto: " +productoDto.getValor());

        double total = productoDto.getCantidad() * productoDto.getValor();
        System.out.println("Total es: "+total);

        if (total> productoDto.getValor()){
            System.out.println("Tiene descuento");
        } else  {
            System.out.println("No tiene descuento");
        }

    }
}
