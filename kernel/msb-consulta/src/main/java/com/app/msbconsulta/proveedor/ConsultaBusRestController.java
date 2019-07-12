/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbconsulta.proveedor;

import com.app.msbconsulta.interfaces.ConsultaBusFeignInterface;
import com.app.msbconsulta.interfaces.ConsultaBusProxyInterface;
import com.app.msbconsulta.objetos.ServicioDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bvaldez
 */
@RestController
public class ConsultaBusRestController {
  
  @Autowired
  private ConsultaBusProxyInterface consultaBusProxy;
  
  @Autowired
  private ConsultaBusFeignInterface consultaBusFeign;  
  
  @GetMapping(path="/servicios/consulta")
  public List<ServicioDto> getServicios(){
    return consultaBusProxy.getServicios();
  }
  
  @GetMapping(path="/servicios/feign/consulta")
  public List<ServicioDto> getServiciosFeign(){
    return consultaBusFeign.getServicios();
  }  
  
  @GetMapping(path="/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
  public List<ServicioDto> getServicios(@PathVariable("idCliente")Integer idCliente, @PathVariable("idEmpresa")Integer idEmpresa){
    return consultaBusProxy.getServicios(idCliente, idEmpresa);
  }    
  
  @GetMapping(path="/facturacion/feign/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
  public List<ServicioDto> getServiciosFeign(@PathVariable("idCliente")Integer idCliente, @PathVariable("idEmpresa")Integer idEmpresa){
    return consultaBusFeign.getServicios(idCliente, idEmpresa);
  }    
  
}
