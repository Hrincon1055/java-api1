package com.hr.apirest.models;

public class ProductoModel {
  private int id;
  private String nombre;
  private int cantidad;
  private double precio;

  public ProductoModel() {
  }

  public ProductoModel(int id, String nombre, int cantidad, double precio) {
    this.id = id;
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.precio = precio;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCantidad() {
    return this.cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecio() {
    return this.precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", nombre='" + getNombre() + "'" +
        ", cantidad='" + getCantidad() + "'" +
        ", precio='" + getPrecio() + "'" +
        "}";
  }

}
