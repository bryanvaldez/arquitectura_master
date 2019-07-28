/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msconsulta.integration.util;

import com.msconsulta.core.business.bean.Servicio;
import com.msconsulta.integration.dto.ClienteDto;
import com.msconsulta.integration.dto.ProductoDto;
import com.msconsulta.integration.dto.ServicioDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
public class Convert {

  public static List<ServicioDto> passLstServicioBeanToServicioDto(List<Servicio> servicios) {
    List<ServicioDto> serviciosDto = new ArrayList<>();
    Iterator<Servicio> itServicio = servicios.iterator();
    while (itServicio.hasNext()) {
      Servicio serviciotmp = itServicio.next();
      ServicioDto servicioDtotmp = new ServicioDto();
      ProductoDto productoDtotmp = new ProductoDto();
      ClienteDto clienteDtotmp = new ClienteDto();
      servicioDtotmp.setCodigo(serviciotmp.getCodigo());
      servicioDtotmp.setEstado(serviciotmp.getEstado());
      servicioDtotmp.setMonto(serviciotmp.getMonto().toString());
      clienteDtotmp.setCodigo(serviciotmp.getCliente().getCodigo());
      clienteDtotmp.setNombres(serviciotmp.getCliente().getNombres());
      productoDtotmp.setCodigo(serviciotmp.getProducto().getCodigo());
      productoDtotmp.setDescripcion(serviciotmp.getProducto().getDescripcion());
      servicioDtotmp.setCliente(clienteDtotmp);
      servicioDtotmp.setProducto(productoDtotmp);
      serviciosDto.add(servicioDtotmp);
      servicioDtotmp = null;
    }
    return serviciosDto;
  }
}
