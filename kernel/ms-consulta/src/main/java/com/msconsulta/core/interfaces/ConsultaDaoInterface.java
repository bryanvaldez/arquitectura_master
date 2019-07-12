/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.msconsulta.core.interfaces;

import com.msconsulta.core.business.bean.Servicio;
import com.msconsulta.core.util.AppException;
import java.util.List;

/**
 *
 * @author User
 */
public interface ConsultaDaoInterface {
  
  public List<Servicio> getServicios() throws AppException;
  
  public List<Servicio> getServicios(Integer idCliente, Integer idEmpresa) throws AppException;  
  
}
