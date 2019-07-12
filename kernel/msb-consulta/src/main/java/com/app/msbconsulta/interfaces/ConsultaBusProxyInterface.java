/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.msbconsulta.interfaces;

import com.app.msbconsulta.objetos.ServicioDto;
import java.util.List;

/**
 *
 * @author bvaldez
 */
public interface ConsultaBusProxyInterface {
  
  public List<ServicioDto> getServicios();
  public List<ServicioDto> getServicios(Integer idCliente, Integer idEmpresa);
  
}
