package com.lvnr.demo.taller.objetos.dto;

public class ProductoDto {
    private String nombreProducto;
    private int cantidad;
    private double valor;

    public void setNombreProducto (String nombreProducto) {
        this.nombreProducto=nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}