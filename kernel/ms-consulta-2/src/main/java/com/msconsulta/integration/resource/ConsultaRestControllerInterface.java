/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msconsulta.integration.resource;

import com.msconsulta.integration.dto.ServicioDto;
import java.util.List;

/**
 *
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
public interface ConsultaRestControllerInterface {
  public List<ServicioDto> getServicios();
  public List<ServicioDto> getServicios(Integer idCliente, Integer idEmpresa);    
}
