/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msconsulta.integration.resource;

import com.msconsulta.core.business.bean.Servicio;
import com.msconsulta.core.business.service.ConsultaService;
import com.msconsulta.core.util.AppException;
import com.msconsulta.integration.dto.ServicioDto;
import com.msconsulta.integration.util.Convert;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
@RestController
public class ConsultaRestController implements ConsultaRestControllerInterface{
  
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private ConsultaService consultaService;
  
  @Override
  @GetMapping(path="/servicios/consulta")
  public List<ServicioDto> getServicios() {
    
    List<Servicio> lstServicios = new ArrayList<>();
    List<ServicioDto> lstServiciosDto = new ArrayList<>();
    try {
      lstServicios = consultaService.getServicios();
      lstServiciosDto = Convert.passLstServicioBeanToServicioDto(lstServicios);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("MS-CONSULTA:8081");
    return lstServiciosDto;
  }

  @Override
  @GetMapping(path="/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}") 
  public List<ServicioDto> getServicios(@PathVariable("idCliente") Integer idCliente, @PathVariable("idEmpresa") Integer idEmpresa) {
    
    List<ServicioDto> lstServiciosDto = new ArrayList<>();
    try {
      List<Servicio> lstServicios = consultaService.getServicios(idCliente, idEmpresa);
      lstServiciosDto = Convert.passLstServicioBeanToServicioDto(lstServicios);
    } catch (AppException e) {
    }
    System.out.println("MS-CONSULTA:8081");
    return lstServiciosDto;
  }
  
}
