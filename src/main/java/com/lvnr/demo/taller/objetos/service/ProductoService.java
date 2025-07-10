package com.lvnr.demo.taller.objetos.service;

import com.lvnr.demo.taller.objetos.dto.ProductoDto;

public class ProductoService {

    public void imprimirProducto (ProductoDto productoDto){
        System.out.println("Nombre del producto: " +productoDto.getNombreProducto());
        System.out.println("Cantidad del producto: " +productoDto.getCantidad());
        System.out.println("Valor del producto: " +productoDto.getValor());

    }
}
