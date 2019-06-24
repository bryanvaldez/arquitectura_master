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
 * @author Bryan Valdez <Bryan at ibryan.valdez@gmail.com>
 */
public interface ConsultaServiceInterface {
  public List<Servicio> getServicios() throws AppException;
}
