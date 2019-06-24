/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msconsulta.core.business.bean;

import java.util.List;

/**
 *
 * @author User
 */
public class Producto {

  private Integer codigo;
  private String descripcion;
  private Integer precio;
  List<Servicio> servicios;

  public Producto() {
  }

  public Producto(Integer codigo, String descripcion) {
    this.codigo = codigo;
    this.descripcion = descripcion;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Integer getPrecio() {
    return precio;
  }

  public void setPrecio(Integer precio) {
    this.precio = precio;
  }

  public List<Servicio> getServicios() {
    return servicios;
  }

  public void setServicios(List<Servicio> servicios) {
    this.servicios = servicios;
  }

}
