/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.mspago.integration.dto;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
public class ServicioDto {
  private Integer codigo;
  private String estado;
  private String monto;
  private ClienteDto cliente;
  private ProductoDto producto;

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getMonto() {
    return monto;
  }

  public void setMonto(String monto) {
    this.monto = monto;
  }

  public ClienteDto getCliente() {
    return cliente;
  }

  public void setCliente(ClienteDto cliente) {
    this.cliente = cliente;
  }

  public ProductoDto getProducto() {
    return producto;
  }

  public void setProducto(ProductoDto producto) {
    this.producto = producto;
  }
  
}
