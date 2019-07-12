/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbconsulta.interfaces;

import com.app.msbconsulta.objetos.ServicioDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author bvaldez
 */
@FeignClient(name="ms-consulta", url="localhost:8081")
public interface ConsultaBusFeignInterface {
  
  @GetMapping(path="/msconsulta/servicios/consulta")
  public List<ServicioDto> getServicios();
  
  @GetMapping(path="/msconsulta/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
  public List<ServicioDto> getServicios(@PathVariable("idCliente") Integer idCliente, @PathVariable("idEmpresa") Integer idEmpresa);  
}
