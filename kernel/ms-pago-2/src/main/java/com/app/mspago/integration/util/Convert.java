/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.mspago.integration.util;

import com.app.mspago.core.bussiness.bean.Cliente;
import com.app.mspago.core.bussiness.bean.Producto;
import com.app.mspago.core.bussiness.bean.Servicio;
import com.app.mspago.integration.dto.ClienteDto;
import com.app.mspago.integration.dto.ProductoDto;
import com.app.mspago.integration.dto.ServicioDto;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
public class Convert {
  public static Servicio passServicioDtoBeanToServicio(ServicioDto servicioDtotmp) {
      Servicio servicio = new Servicio();
      Producto producto = new Producto();
      Cliente cliente = new Cliente();
      servicio.setCodigo(servicioDtotmp.getCodigo());
      servicio.setEstado(servicioDtotmp.getEstado());
      servicio.setMonto( servicioDtotmp.getMonto() != null ? Integer.parseInt(servicioDtotmp.getMonto()):0 );
      cliente.setCodigo(servicioDtotmp.getCliente().getCodigo());
      cliente.setNombres(servicioDtotmp.getCliente().getNombres());
      producto.setCodigo(servicioDtotmp.getProducto().getCodigo());
      producto.setDescripcion(servicioDtotmp.getProducto().getDescripcion());
      servicio.setCliente(cliente);
      servicio.setProducto(producto);
    return servicio;
  }  
}
