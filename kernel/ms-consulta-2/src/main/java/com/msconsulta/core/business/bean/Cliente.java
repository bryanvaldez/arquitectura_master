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
public class Cliente {

  private Integer codigo;
  private String nombres;
  private Empresa empresa;
  private List<Servicio> servicios;

  public Cliente() {
  }

  public Cliente(Integer codigo, String nombres) {
    this.codigo = codigo;
    this.nombres = nombres;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public Empresa getEmpresa() {
    return empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public List<Servicio> getServicios() {
    return servicios;
  }

  public void setServicios(List<Servicio> servicios) {
    this.servicios = servicios;
  }

}
